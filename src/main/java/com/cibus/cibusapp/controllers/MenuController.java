package com.cibus.cibusapp.controllers;

import com.cibus.cibusapp.models.Menu;
import com.cibus.cibusapp.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MenuController {

  @Autowired
  public MenuService menuService;

  @GetMapping("/menu")
  public String getMenu(Model model){
    List<Menu> menuList = menuService.getMenu();
    model.addAttribute(menuList);
    return "menu";
  }


}
