package com.example.foodtruckapp.service;

import com.example.foodtruckapp.model.FoodTruck;
import com.example.foodtruckapp.repository.FoodTruckRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodTruckService {
    private static final Logger logger = LoggerFactory.getLogger(FoodTruckService.class);

    @Autowired
    private FoodTruckRepository foodTruckRepository;


    public List<FoodTruck> getAllFoodTrucks() {
        return foodTruckRepository.findAll();
    }

    public List<FoodTruck> searchFoodTrucks(String query) {
        return foodTruckRepository.findByApplicantContainingIgnoreCase(query);
    }

    @Transactional
    public FoodTruck saveFoodTruck(FoodTruck foodTruck) {
        FoodTruck savedFoodTruck = foodTruckRepository.save(foodTruck);
        logger.info("FoodTruck saved: {}", savedFoodTruck);
        return savedFoodTruck;
    }
}

