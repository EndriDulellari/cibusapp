package com.cibus.cibusapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cibus.cibusapp.services.CountryService;

@Controller
public class StateController {

	@Autowired private CountryService countryService;
	
	//Get All States
	@GetMapping("states")
	public String findAll(Model model){
		model.addAttribute("countries", countryService.findAll());
		return "state";
	}
	
	@RequestMapping(value="states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		return "redirect:/states";
	}
}
