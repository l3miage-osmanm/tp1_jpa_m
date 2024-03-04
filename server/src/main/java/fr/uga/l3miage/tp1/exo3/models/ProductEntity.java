package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table
public class ProductEntity {
    @Id
    @Column(name="bar_code_number") private String bar_code_number;
    @Column(name="name") private String name;
    @Column(name="consumable") private Boolean consumable;
    @ManyToOne
    private BrandMiageEntity marque;



}
