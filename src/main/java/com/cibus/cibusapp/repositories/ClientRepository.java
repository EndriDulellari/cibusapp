package com.cibus.cibusapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibus.cibusapp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
