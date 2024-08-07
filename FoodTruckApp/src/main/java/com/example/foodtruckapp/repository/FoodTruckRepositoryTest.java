package com.example.foodtruckapp.repository;

import com.example.foodtruckapp.model.FoodTruck;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class FoodTruckRepositoryTest {

    @Autowired
    private FoodTruckRepository foodTruckRepository;

    @Test
    public void testFindByApplicantContainingIgnoreCase() {
        List<FoodTruck> foodTrucks = foodTruckRepository.findByApplicantContainingIgnoreCase("Zuri");
        assertThat(foodTrucks).isNotEmpty();
    }
}
