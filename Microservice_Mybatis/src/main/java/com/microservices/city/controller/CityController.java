package com.microservices.city.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.city.dto.CityResponseBody;
import com.microservices.city.entity.City;
import com.microservices.city.service.CityService;

@RestController
@RequestMapping(path = "city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("getCityById/{id}")
	public CityResponseBody getCityById(@PathVariable Long id) {
		return cityService.getCityById(id);
	}
	
	@GetMapping("getAllCities")
	public List<CityResponseBody> getAllCities() {
		return cityService.getAllCities();
	}
	
	@PostMapping("insertCity")
	public CityResponseBody insertCity(@RequestBody City city) {
		return cityService.insertCity(city);
	}
	
	@PutMapping("updateCity")
	public CityResponseBody updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
	}
	
	@DeleteMapping("deleteCityById/{id}")
	public List<CityResponseBody> deleteCityById(@PathVariable Long id) {
		return cityService.deleteCityById(id);
	}

}
