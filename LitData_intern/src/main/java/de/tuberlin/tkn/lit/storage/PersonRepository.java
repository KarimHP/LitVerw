package main.java.de.tuberlin.tkn.lit.storage;

import de.tuberlin.tkn.lit.model.actors.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}