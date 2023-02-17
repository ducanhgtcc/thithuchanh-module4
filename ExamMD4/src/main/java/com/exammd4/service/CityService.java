package com.exammd4.service;

import com.exammd4.model.City;
import com.exammd4.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService {

    @Autowired
    private ICityRepository cityRepository;


    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public City findCityByName(String cityName) {
        return cityRepository.findCityByName(cityName);
    }
}
