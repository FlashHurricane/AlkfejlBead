package hu.elte.trainingscheduler.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String description;

    @Column
    @NotNull
    private String place;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    private String trainer;

    @Column
    @NotNull
    private Integer capacity;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status{
        COMING, ENDED
    }

    @Column
    @NotNull
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column
    @NotNull
    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    @OneToMany(mappedBy = "training")
    private List<Message> messages;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Label> labels;

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
