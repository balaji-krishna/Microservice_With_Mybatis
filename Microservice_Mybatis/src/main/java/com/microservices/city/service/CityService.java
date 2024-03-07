package com.microservices.city.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.city.dto.CityResponseBody;
import com.microservices.city.entity.City;
import com.microservices.city.mapper.CityMapper;

@Service
public class CityService {
	
	@Autowired
	private CityMapper cityMapper;

	public CityResponseBody getCityById(Long id) {
		return cityMapper.getCityById(id);
	}

	public List<CityResponseBody> getAllCities() {
		return cityMapper.getAllCities();
	}

	public CityResponseBody insertCity(City city) {
		cityMapper.insertCity(city.getId(), city.getCityName(), city.getStateName(), city.getArea());
		return cityMapper.getCityById(city.getId());
	}

	public CityResponseBody updateCity(City city) {
		cityMapper.updateCity(city.getId(), city.getCityName(), city.getStateName(), city.getArea());
		return cityMapper.getCityById(city.getId());
	}

	public List<CityResponseBody> deleteCityById(Long id) {
		cityMapper.deleteCityById(id);
		return cityMapper.getAllCities();
	}

}
