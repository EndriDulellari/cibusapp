package com.cibus.cibusapp.services;

import com.cibus.cibusapp.models.Reservation;
import com.cibus.cibusapp.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

  @Autowired
  private ReservationRepository reservationRepository;


  public List<Reservation> findAll(){
    return reservationRepository.findAll();
  }

  //Add new Reservation
  public void save(Reservation reservation){
    reservationRepository.save(reservation);
  }

  //GET by ID
  public Optional<Reservation> findById(int id){
    return reservationRepository.findById(id);
  }
}
