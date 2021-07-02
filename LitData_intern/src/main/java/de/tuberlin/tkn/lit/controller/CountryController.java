package main.java.de.tuberlin.tkn.lit.controller;

import de.tuberlin.tkn.lit.model.objects.Country;
import de.tuberlin.tkn.lit.service.ICountryService;
import de.tuberlin.tkn.lit.storage.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private ICountryService countryService;

    @CrossOrigin
    @GetMapping("/db/all/countries")
    public List<Country> findAll() {
        CountryRepository repo = countryService.getRepository();
        return (List<Country>) repo.findAll();
    }
}