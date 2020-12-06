package com.cibus.cibusapp.controllers;

import com.cibus.cibusapp.models.Reservation;
import com.cibus.cibusapp.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ReservationController {

  @Autowired
  private ReservationService reservationService;

  @GetMapping("/reservations")
  public String findAll(Model model){
    List<Reservation> reservationList = reservationService.findAll();
    model.addAttribute("reservations", reservationList);
    return "reservation";
  }

  @PostMapping("/reservations/addNew")
  public String addNew(Reservation reservation){
    reservationService.save(reservation);
    return "redirect:/reservations";
  }

  @RequestMapping("reservations/findById")
  @ResponseBody
  public Optional<Reservation> findById(int id){
    return  reservationService.findById(id);
  }

  @RequestMapping(value = "/reservations/update", method = {RequestMethod.PUT, RequestMethod.GET})
  public String update(Reservation reservation){
    reservationService.save(reservation);
    return "redirect:/reservations";
  }

}
