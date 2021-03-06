package com.cibus.cibusapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibus.cibusapp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
