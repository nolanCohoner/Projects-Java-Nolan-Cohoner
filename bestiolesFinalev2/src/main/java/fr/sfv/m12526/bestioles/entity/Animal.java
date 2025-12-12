package fr.sfv.m12526.bestioles.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity //uptodate
@Table(name="animal")
public class Animal {

    @Id
    @Column(columnDefinition = "int", nullable = false)
    private Long id;

    @Column(columnDefinition = "varchar(50)")
    private String color;

    @Column(columnDefinition = "varchar(50)")
    private String name;

    @Column(columnDefinition = "varchar(255)")
    private String sex;

    @ManyToOne
    @JoinColumn(name = "species_id")
    private Species species;

    @ManyToMany
    @JoinTable(name="person_animals",
            joinColumns= @JoinColumn(name="animals_id", referencedColumnName="ID"),
            inverseJoinColumns= @JoinColumn(name="person_id", referencedColumnName="ID")
    )
    @ToString.Exclude
    private Set<Person> person;

    //@Column(columnDefinition = "int", nullable = false)
    //private String species_id;
}
