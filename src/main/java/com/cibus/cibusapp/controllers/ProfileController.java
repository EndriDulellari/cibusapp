package com.cibus.cibusapp.controllers;
import com.cibus.cibusapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.security.Principal;

@Controller
public class ProfileController {

  @Autowired
  private EmployeeService employeeService;

  public String profile(Model model, Principal principal){
    String userName = principal.getName();
    model.addAttribute("employee",employeeService.findByUsername(userName));
    return "profile";
  }
}
