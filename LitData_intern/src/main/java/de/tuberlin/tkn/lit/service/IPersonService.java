package main.java.de.tuberlin.tkn.lit.service;

import de.tuberlin.tkn.lit.controller.PersonController;
import de.tuberlin.tkn.lit.model.actors.Person;
import de.tuberlin.tkn.lit.model.objects.Country;
import de.tuberlin.tkn.lit.storage.PersonRepository;

import java.util.List;

public interface IPersonService {

    List<Person> findAll();

    PersonRepository getRepository();
}