package fr.sfv.m12526.bestioles.boot;

import fr.sfv.m12526.bestioles.Repository.AnimalRepository;
import fr.sfv.m12526.bestioles.Repository.PersonRepository;
import fr.sfv.m12526.bestioles.Repository.SpeciesRepository;
import fr.sfv.m12526.bestioles.entity.Animal;
import fr.sfv.m12526.bestioles.entity.Person;
import fr.sfv.m12526.bestioles.entity.Species;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Startup implements CommandLineRunner {
    private final AnimalRepository animalRepository;
    private final PersonRepository personRepository;
    private final SpeciesRepository speciesRepository;

    public Startup(AnimalRepository animalRepository, PersonRepository personRepository, SpeciesRepository speciesRepository) {
        this.animalRepository = animalRepository;
        this.personRepository = personRepository;
        this.speciesRepository = speciesRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //Animal unAnimal = animalRepository.findById(1L).get();

       // List<Person> gensAvecAnimaux = personRepository.findPersonByAnimal(unAnimal);
        //gensAvecAnimaux.forEach(System.out::println);

        List<Species> especesDansOrdre = speciesRepository.findAllOrderByCommonName();
        especesDansOrdre.forEach(System.out::println);

        List<Species> especesDansOrdre1 = speciesRepository.findAllOrderByCommonName();
        especesDansOrdre1.forEach(System.out::println);


        //int nbAnimauxDontSexEgal = animalRepository.countAnimalsBySex("M");
        //System.out.println(nbAnimauxDontSexEgal);
        //List<Person> gensAgees = personRepository.findPersonsBetweenAges(1,32);
        //gensAgees.forEach(System.out::println);

        //personRepository.deletePersonByNonAnimal();
        personRepository.createEntity(3);
    }

}
