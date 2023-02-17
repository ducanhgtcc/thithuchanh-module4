package com.exammd4.service;

import com.exammd4.model.City;

public interface ICityService extends IGeneralService<City> {
    City findCityByName(String cityName);
}
