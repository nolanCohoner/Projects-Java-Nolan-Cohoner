package fr.sfv.m12526.bestioles.Repository;

import fr.sfv.m12526.bestioles.entity.Animal;
import fr.sfv.m12526.bestioles.entity.Person;
import fr.sfv.m12526.bestioles.entity.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findBySpecies(Species species);

    List<Animal> findByColorIn(Collection<String> colors);

    List<Animal> findByColorContaining(String color);

    @Query("SELECT COUNT(*) FROM Animal a WHERE a.sex LIKE :sexAnimal")
    int countAnimalsBySex(String sexAnimal);

    //@Query("SELECT CASE WHEN COUNT(a) > 0 THEN true ELSE false END FROM Animal a WHERE a = :animal AND a.person IS NOT NULL")
    //boolean existsByPerson(Animal animal);



}
