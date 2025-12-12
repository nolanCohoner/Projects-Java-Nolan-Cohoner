package fr.sfv.m12526.bestioles.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(columnDefinition = "int", nullable = false)
    private Long id;

    @Column(columnDefinition = "int")
    private int age;

    @Column(columnDefinition = "varchar(50)")
    private String firstname;

    @Column(columnDefinition = "varchar(50)")
    private String lastname;

    @Column(unique = true,columnDefinition = "varchar(50)", nullable = false)
    private String login;

    @Column(columnDefinition = "varchar(100)")
    private String mdp;

    @Column(columnDefinition = "tinyint")
    private int active;

    @ManyToMany
    @JoinTable(name="person_animals",
            joinColumns= @JoinColumn(name="person_id", referencedColumnName="ID"),
            inverseJoinColumns= @JoinColumn(name="animals_id", referencedColumnName="ID")
    )
    @ToString.Exclude
    private Set<Animal> animals;

}
