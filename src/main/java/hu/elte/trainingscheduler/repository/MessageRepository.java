package hu.elte.trainingscheduler.repository;

import hu.elte.trainingscheduler.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {
}
