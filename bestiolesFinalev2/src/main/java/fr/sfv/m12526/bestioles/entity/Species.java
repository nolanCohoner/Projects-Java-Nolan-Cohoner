package fr.sfv.m12526.bestioles.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Table(name="species")
public class Species {

    @Id
    @Column(columnDefinition = "int", nullable = false)
    private Long id;

    @Column(columnDefinition = "varchar(50)")
    private String commonName;

    @Column(columnDefinition = "varchar(200)")
    private String latinName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "species")
    //@JoinColumn(name = "animal_id")
    @ToString.Exclude
    private Set<Animal> animals;
}
