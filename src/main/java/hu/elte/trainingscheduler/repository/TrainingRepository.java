package hu.elte.trainingscheduler.repository;

import hu.elte.trainingscheduler.model.Training;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends CrudRepository<Training, Integer> {
    Iterable<Training> findAllByTitle(String title);
}
