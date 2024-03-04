package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class Session {
    @Id
    @Column(name = "idSession")
    private UUID idSession;
    @Column(name="lock") private Boolean lock;
    @Column(name="cuurentDir") private String currentDir;
    @Column(name="lastCommand") private String lastCommand;
    @OneToOne(mappedBy = "idUser")
    private User utilisateur;
}
