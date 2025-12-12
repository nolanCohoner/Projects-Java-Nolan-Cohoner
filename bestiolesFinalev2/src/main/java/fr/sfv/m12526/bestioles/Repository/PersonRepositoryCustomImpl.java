package fr.sfv.m12526.bestioles.Repository;

import fr.sfv.m12526.bestioles.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.Random;
import java.util.UUID;

@Transactional
public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void deletePersonByNonAnimal() {
            em.createQuery("DELETE FROM Person p WHERE p.animals IS EMPTY ").executeUpdate();
            //query.setParameter("name", "Doe")
            //em.remove(em.find(Person.class, 1));
    }

    @Override
    public void createEntity(int nbEntity) {

        for (int i = 0; i < nbEntity; i++) {

            String StringRandom1 = UUID.randomUUID().toString().substring(0, 5);
            String StringRandom2 = UUID.randomUUID().toString().substring(0, 5);
            String StringRandom3 = UUID.randomUUID().toString().substring(0, 5);
            String StringRandom4 = UUID.randomUUID().toString().substring(0, 5);
            Random random = new Random();
            random.ints();

            Person p = new Person();

            p.setAge(random.nextInt(100));
            p.setActive(random.nextInt(1));
            p.setFirstname(StringRandom1);
            p.setLastname(StringRandom2);
            p.setLogin(StringRandom3);
            p.setMdp(StringRandom4);
            em.persist(p);
        }

    }
}
