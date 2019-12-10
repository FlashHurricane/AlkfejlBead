package hu.elte.trainingscheduler.controller;

import hu.elte.trainingscheduler.model.Message;
import hu.elte.trainingscheduler.model.Training;
import hu.elte.trainingscheduler.repository.MessageRepository;
import hu.elte.trainingscheduler.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trainings")
public class TrainingController {

    @Autowired
    private TrainingRepository trainingRepository;

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("")
    public Iterable<Training> getTrainings(){
        return trainingRepository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Training> createTraining(
            @RequestBody Training training
    ){
        training.setCreatedAt(LocalDateTime.now());
        training.setModifiedAt(LocalDateTime.now());
        Training savedTraining = trainingRepository.save(training);
        return ResponseEntity.ok(savedTraining);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTraining(
            @PathVariable Integer id
    ){
        try{
            trainingRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{id}/messages")
    public ResponseEntity<Message> addMessage(
            @RequestBody Message message,
            @PathVariable Integer id
    ) {
        Optional<Training> oTraining = trainingRepository.findById(id);
        if (oTraining.isPresent()) {
            Training training = oTraining.get();
            training.getMessages().add(message);
            message.setTraining(training);
            Message createdMessage = messageRepository.save(message);
            return ResponseEntity.ok(createdMessage);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}
