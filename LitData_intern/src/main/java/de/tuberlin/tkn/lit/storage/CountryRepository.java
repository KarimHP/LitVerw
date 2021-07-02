package main.java.de.tuberlin.tkn.lit.storage;

import de.tuberlin.tkn.lit.model.objects.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

}