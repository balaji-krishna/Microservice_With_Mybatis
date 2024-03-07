package com.microservices.city.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservices.city.dto.CityResponseBody;

@Mapper
public interface CityMapper {

	CityResponseBody getCityById(Long id);
	
	List<CityResponseBody> getAllCities();

	void insertCity(Long id, String cityName, String stateName, Long area);

	void updateCity(Long id, String cityName, String stateName, Long area);

	void deleteCityById(Long id);

}
