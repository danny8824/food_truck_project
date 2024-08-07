package com.example.foodtruckapp.controller;

import com.example.foodtruckapp.DataLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DataLoaderController {

    @Autowired
    private DataLoaderService dataLoaderService;

//    @GetMapping("/load-data")
//    public String loadData() {
//        try {
//            dataLoaderService.loadData();
//            return "Data loaded successfully";
//        } catch (IOException e) {
//            return "Error loading data: " + e.getMessage();
//        }
//    }
}
