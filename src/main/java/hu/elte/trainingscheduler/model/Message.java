package hu.elte.trainingscheduler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    @Column
    String body;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime vreated_at;

    @JsonIgnore
    @ManyToOne
    private Training training;

    public void setTraining(Training training) {
        this.training = training;
    }
}
