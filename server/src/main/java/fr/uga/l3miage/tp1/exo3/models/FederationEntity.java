package fr.uga.l3miage.tp1.exo3.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jdk.jfr.Enabled;
import javax.persistence.*;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table
public class FederationEntity {
    @Id @Column() private  String name;
    @Column()private  boolean isFageMembership;
    @OneToMany(mappedBy = "federation")
    private Set<AssociationEntity> associations;
    @ManyToOne()
    private AssociationEntity association;

}
