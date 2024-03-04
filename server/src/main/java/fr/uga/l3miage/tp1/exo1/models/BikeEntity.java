package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class BikeEntity {
    @Id @Column(name="immat",length=8) private String immatriculation;
    @Column(name="cylinder_number") @Enumerated(EnumType.STRING) private CylinderNumber cylinderNumber;
    @Column(name="shifter_type") @Enumerated(EnumType.ORDINAL) private ShifterType shifterType;
    @Column(name="automatic") private Boolean automatic;
    @Column(name="shifter") private Boolean shifter;
    @Column(name="circulation_date") private LocalDate circulationDate;
    @Column(name="capacity") private Integer capacity;
}
