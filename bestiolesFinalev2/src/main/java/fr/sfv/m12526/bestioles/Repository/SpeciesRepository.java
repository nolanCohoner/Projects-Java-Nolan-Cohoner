package fr.sfv.m12526.bestioles.Repository;

import fr.sfv.m12526.bestioles.entity.Person;
import fr.sfv.m12526.bestioles.entity.Species;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeciesRepository extends CrudRepository<Species, Long> {

    List<Species> findFirstByCommonName(String commonName);

    List<Species> findAllByLatinNameIgnoreCase(String latinName);

    @Query("From Species s ORDER BY s.commonName ASC")
    List<Species> findAllOrderByCommonName();

    @Query("SELECT s FROM Species s WHERE s.commonName LIKE :commonName")
    List<Species> findByCommonNameLike(String commonName);
}
