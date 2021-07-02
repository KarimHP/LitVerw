package main.java.de.tuberlin.tkn.lit.service;

import de.tuberlin.tkn.lit.model.objects.Country;
import de.tuberlin.tkn.lit.storage.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XCountryService implements ICountryService {

    public CountryRepository getRepository() {
        return repository;
    }

    @Autowired
    private CountryRepository repository;


    @Override
    public List<Country> findAll() {

        return (List<Country>) repository.findAll();
    }
}