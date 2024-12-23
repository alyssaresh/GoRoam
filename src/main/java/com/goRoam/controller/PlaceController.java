package com.goRoam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.goRoam.model.Place;
import com.goRoam.repository.PlaceRepo;

@RestController
public class PlaceController {

    // public String getPage() {
    //     return "Welcome";
    // }

    @Autowired
    PlaceRepo repo;
    //return list of Places
    @GetMapping("/places")
    public List<Place> getAllPlaces(){
        return repo.findAll();
    }
}
