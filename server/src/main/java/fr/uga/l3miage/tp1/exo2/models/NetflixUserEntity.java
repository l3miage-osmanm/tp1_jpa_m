package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;

import fr.uga.l3miage.tp1.exo2.typenum.sex;

import java.time.LocalDate;


@Entity
@Table
public class NetflixUserEntity {
    @Id
    @Column(name = "ID")
    private long ID;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "sex")
    @Enumerated(EnumType.ORDINAL)
    private sex sexe;
    @Column(name = "birthDate")
    private LocalDate birthDate;
    @OneToOne
    private NetflixAccountEntity Account;
}
