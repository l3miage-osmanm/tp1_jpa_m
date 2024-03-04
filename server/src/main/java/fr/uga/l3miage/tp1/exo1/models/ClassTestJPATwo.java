package fr.uga.l3miage.tp1.exo1.models;
import fr.uga.l3miage.tp1.exo1.enums.PowerType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class ClassTestJPATwo {
    @Id
    private String myIdTest;

    @Column(unique=true)
    private String testName;

    @Column(precision = 1)
    private Double jpaSeed;

    @Column()
    private Date savedAt;
}