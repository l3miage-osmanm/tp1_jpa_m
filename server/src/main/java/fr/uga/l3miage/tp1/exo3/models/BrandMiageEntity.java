package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.types.BrandType;
import  fr.uga.l3miage.tp1.exo3.models.ProductEntity;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class BrandMiageEntity {
    @Id @Column(name="company_name") private String company_name;
    @Column(name="siretNumber",length = 15) private String siretNumber;
    @Column(name="type") @Enumerated(EnumType.ORDINAL) private BrandType type;
    @OneToMany(mappedBy = "marque")
    private Set<ProductEntity> products;
}
