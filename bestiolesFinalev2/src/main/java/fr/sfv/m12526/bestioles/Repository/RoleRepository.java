package fr.sfv.m12526.bestioles.Repository;

import fr.sfv.m12526.bestioles.entity.Person;
import fr.sfv.m12526.bestioles.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
