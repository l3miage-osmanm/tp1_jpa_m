package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.LocalDate;
import fr.uga.l3miage.tp1.exo2.typenum.sex;

@Entity
@Table(name = "NetflixUser")
public class NetflixUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Si vous voulez une génération automatique
    private Long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "firstname")
    private String firstName;

    @Enumerated(EnumType.STRING) // ORDINAL est risqué si l'ordre des enums change
    private sex sex;

    @Column(name = "birthDate")
    private LocalDate birthDate;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private NetflixAccountEntity account;

}
