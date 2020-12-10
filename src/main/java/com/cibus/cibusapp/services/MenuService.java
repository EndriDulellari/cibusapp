package com.cibus.cibusapp.services;

import com.cibus.cibusapp.models.Menu;
import com.cibus.cibusapp.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

  @Autowired
  private MenuRepository menuRepository;

  public List<Menu> getMenu(){
    return  menuRepository.findAll();
  }

  public Optional<Menu> findById(int id){
    return menuRepository.findById(id);
  }

  public void save(Menu menu){
    menuRepository.save(menu);
  }

  public void delete(Integer id){
    menuRepository.deleteById(id);
  }


}
