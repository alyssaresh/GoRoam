package com.goRoam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.goRoam.model.UserInterest;

public interface UserInterestRepo extends JpaRepository<UserInterest, Integer>{
}
