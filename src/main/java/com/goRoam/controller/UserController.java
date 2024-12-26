package com.goRoam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.goRoam.model.User;
import com.goRoam.repository.UserRepo;


@RestController
public class UserController {

    @Autowired
    UserRepo repo;
    //return list of Users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return repo.findAll();
    }
}
