package fr.sfv.m12526.bestioles.Repository;

import fr.sfv.m12526.bestioles.entity.Animal;
import fr.sfv.m12526.bestioles.entity.Person;
import fr.sfv.m12526.bestioles.entity.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>,PersonRepositoryCustom{

    List<Person> findByLastnameOrFirstname(String lastName, String firstName);

    List<Person> findByAgeGreaterThanEqual(int age);

    List<Person> deleteByFirstname(String firstname);

    @Query("SELECT p FROM Person p WHERE p.age BETWEEN :ageMin AND :ageMax")
    List<Person> findPersonsBetweenAges( int ageMin, int ageMax);

    @Query("SELECT p FROM Person p JOIN p.animals a WHERE a = :animal")
    List<Person> findPersonByAnimal(Animal animal);

    @Query("DELETE FROM Person p WHERE p.firstname = :paraNom")
    @Modifying
    void deletePersonByFirstname(String paraNom);

}
