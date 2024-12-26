package com.goRoam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.goRoam.model.UserInterest;
import com.goRoam.repository.UserInterestRepo;


@RestController
public class UserInterestController {

    @Autowired
    UserInterestRepo repo;
    //return list of User Interests
    @GetMapping("/user_interests")
    public List<UserInterest> getAllUserInterests(){
        return repo.findAll();
    }
}
