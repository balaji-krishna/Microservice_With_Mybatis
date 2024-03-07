package com.microservices.city.entity;

public class City {
	
	private Long id;
	
	private String cityName;
	
	private String stateName;
	
	private Long area;

	public City() {
		super();
	}

	public City(Long id, String cityName, String stateName, Long area) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.stateName = stateName;
		this.area = area;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

}
