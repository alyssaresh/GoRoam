package com.goRoam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.goRoam.model.Place;

public interface PlaceRepo extends JpaRepository<Place, Integer>{

}
