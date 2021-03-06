package com.cibus.cibusapp;

import com.cibus.cibusapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ApplicationController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/index")
  public String goHome(){
    return "index";
  }

  @GetMapping("/login")
  public String login(){
    return "login";
  }

  @GetMapping("/logout")
  public String logout(){
    return "login";
  }

  @GetMapping(value="/profile")
  public String profile(Model model, Principal principal){
    String userName = principal.getName();
    model.addAttribute("employee",employeeService.findByUsername(userName));
    return "profile";
  }
}
