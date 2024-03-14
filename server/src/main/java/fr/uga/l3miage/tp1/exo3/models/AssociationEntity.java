package fr.uga.l3miage.tp1.exo3.models;
import fr.uga.l3miage.tp1.exo3.types.AssociationType;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table
public class AssociationEntity {
    @Id @Column() private  String name;
     @Column(nullable=false) private  String presidentName;
    @Column(nullable=false) private  String treasurerName;
    @Column() private  String secretaryName;
    @Column() private AssociationType associationType;

    @ManyToOne()
    private FederationEntity federation;

    @OneToMany(mappedBy="association")
    private Set<FederationEntity> federations;


}
