package com.goRoam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.goRoam.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
