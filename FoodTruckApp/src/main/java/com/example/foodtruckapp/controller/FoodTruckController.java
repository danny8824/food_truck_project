package com.example.foodtruckapp.controller;

import com.example.foodtruckapp.model.FoodTruck;
import com.example.foodtruckapp.repository.FoodTruckRepository;
import com.example.foodtruckapp.service.FoodTruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foodtrucks")
public class FoodTruckController {

    @Autowired
    private FoodTruckService foodTruckService;
    @Autowired
    private FoodTruckRepository foodTruckRepository;

    @GetMapping
    public List<FoodTruck> getAllFoodTrucks() {
        return foodTruckService.getAllFoodTrucks();
    }

    @GetMapping("/search")
    public List<FoodTruck> searchFoodTrucks(@RequestParam String query) {
        System.out.println("Search query: " + query);
        return foodTruckRepository.findByApplicantContainingIgnoreCase(query);
    }

    @GetMapping("/{locationId}")
    public FoodTruck getFoodTruckById(@PathVariable Long locationId) {
        return foodTruckRepository.findById(locationId).orElse(null);
    }
}
