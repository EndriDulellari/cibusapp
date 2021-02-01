package com.cibus.cibusapp.controllers;

import com.cibus.cibusapp.models.City;
import com.cibus.cibusapp.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CityController {
	
	@Autowired private CityService cityService;
	
	//Get All Cities
	@GetMapping("cities")
	public String findAll(Model model){		
		model.addAttribute("cities", cityService.findAll());
		return "city";
	}	
	
	@RequestMapping("cities/findById")
	@ResponseBody
	public Optional<City> findById(Integer id)
	{
		return cityService.findById(id);
	}
	
	//Add City
	@PostMapping(value="cities/addNew")
	public String addNew(City city) {
		cityService.save(city);
		return "redirect:/cities";
	}	
	
	@RequestMapping(value="Cities/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(City city) {
		cityService.save(city);
		return "redirect:/cities";
	}
	
	@RequestMapping(value="cities/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		cityService.delete(id);
		return "redirect:/cities";
	}
}
