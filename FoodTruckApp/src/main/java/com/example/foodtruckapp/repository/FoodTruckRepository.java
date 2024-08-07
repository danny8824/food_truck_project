package com.example.foodtruckapp.repository;

import com.example.foodtruckapp.model.FoodTruck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodTruckRepository extends JpaRepository<FoodTruck, Long> {
    List<FoodTruck> findByApplicantContainingIgnoreCase(String applicant);
}

