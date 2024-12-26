package com.goRoam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user) {
        repo.save(user);
        return "user created";
    }

    @PutMapping("/updateUser/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User user) {
        User updatedUser = repo.findById(id).get();
        updatedUser.setUsername(user.getUsername());
        updatedUser.setEmail(user.getEmail());
        repo.save(updatedUser);
        return "user updated";
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        User deletedUser = repo.findById(id).get();
        repo.delete(deletedUser);
        return "deleted user with id " + id;
    }
}
