package fr.uga.l3miage.tp1.exo2.models;
import javax.persistence.*;

import fr.uga.l3miage.tp1.exo2.typenum.sex;

import java.time.LocalDate;
import java.time.OffsetDateTime;


@Entity
@Table(name = "_user")
public class User {
    @Id
    @Column(name = "idUser")
    private long idUser;
    @Column(name="SSO") private Boolean SSO;
    @Column(name="lastConnexion") private OffsetDateTime lastConnexion;

    @OneToOne()
    private Session s;
}
