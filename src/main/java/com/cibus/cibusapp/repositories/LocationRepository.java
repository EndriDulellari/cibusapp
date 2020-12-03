package com.cibus.cibusapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibus.cibusapp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
