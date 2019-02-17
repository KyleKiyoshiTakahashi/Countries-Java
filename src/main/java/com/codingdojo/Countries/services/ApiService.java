package com.codingdojo.Countries.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.codingdojo.Countries.repositories.CityRepo;
import com.codingdojo.Countries.repositories.CountryRepo;
import com.codingdojo.Countries.repositories.LanguageRepo;

@Service
public class ApiService {
	private final CountryRepo countryR;
	private final CityRepo cityR;
	private final LanguageRepo langR;
	
	public ApiService(CountryRepo countryR, CityRepo cityR, LanguageRepo langR) {
		this.countryR = countryR;
		this.cityR = cityR;
		this.langR = langR;
	}

	public List<Object[]> slovene() {
        List<Object[]> table = countryR.joinAllCountriesSlovene();
        
        return table;
    }
	public List<Object[]> totalcities() {
        List<Object[]> table = countryR.findAllCountriesTotalCities();
        return table;
    }
    public List<Object[]> mexico() {
        List<Object[]> table = cityR.findCitiesMexicoPopulation500k();
        return table;
    }
    public List<Object[]> mainlang() {
        List<Object[]> table = langR.findAllLangsSpokenOver89();
        return table;
    }
    public List<Object[]> surfacepop() {
        List<Object[]> table = countryR.findCountriesBySize();
        return table;
    }
    public List<Object[]> firstworldmonarchy() {
        List<Object[]> table = countryR.findCountriesConstMonarchySA200LE75();
        return table;
    }
    public List<Object[]> argentina() {
        List<Object[]> table = cityR.findCitiesArgentinaPop500k();
        return table;
    }
    public List<Object[]> regions() {
        List<Object[]> table = countryR.findCountriesRegions();
        return table;
    }
}
