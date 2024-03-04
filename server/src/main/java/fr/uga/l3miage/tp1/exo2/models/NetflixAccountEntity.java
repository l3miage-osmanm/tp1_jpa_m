package fr.uga.l3miage.tp1.exo2.models;
import javax.persistence.*;

import fr.uga.l3miage.tp1.exo2.typenum.typeAccount;

@Entity
@Table
public class NetflixAccountEntity {
    @Id
    @Column(name="ID") private long ID;
    @Column(name="nb_devices") private Integer nb_devices;
    @Column(name="typeAccount") @Enumerated(EnumType.ORDINAL)private typeAccount type_Account;
    @OneToOne(mappedBy = "uuid")
    private NetflixAccountEntity User;

}
