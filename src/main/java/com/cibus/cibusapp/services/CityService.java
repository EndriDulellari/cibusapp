package com.cibus.cibusapp.services;

import com.cibus.cibusapp.models.City;
import com.cibus.cibusapp.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;
	
	//Get All Cities
	public List<City> findAll(){
		return cityRepository.findAll();
	}	
	
	//Get City By Id
	public Optional<City> findById(int id) {
		return cityRepository.findById(id);
	}	
	
	//Delete City
	public void delete(int id) {
		cityRepository.deleteById(id);
	}
	
	//Update City
	public void save(City city) {
		cityRepository.save(city);
	}

}
