package fr.sfv.m12526.bestioles.Repository;

import fr.sfv.m12526.bestioles.entity.Animal;

public interface PersonRepositoryCustom {
    void deletePersonByNonAnimal();
    void createEntity(int nbEntity);
}
