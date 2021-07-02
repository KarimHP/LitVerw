package main.java.de.tuberlin.tkn.lit.service;

import de.tuberlin.tkn.lit.controller.CountryController;
import de.tuberlin.tkn.lit.model.objects.Country;
import de.tuberlin.tkn.lit.storage.CountryRepository;

import java.util.List;

public interface ICountryService {

    List<Country> findAll();

    CountryRepository getRepository();
}