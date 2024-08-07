package com.example.foodtruckapp;

import com.example.foodtruckapp.model.FoodTruck;
import com.example.foodtruckapp.repository.FoodTruckRepository;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DataLoaderService implements CommandLineRunner {

    @Autowired
    private FoodTruckRepository repository;

    @Override
    public void run(String... args) throws Exception {
        CSVParser parser = new CSVParserBuilder().withSeparator('!').build(); // Set '!' as the delimiter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy HH:mm:ss 'GMT'Z (zzzz)");

        try (CSVReader reader = new CSVReaderBuilder(new FileReader("/Users/azamatesenamanov/Downloads/Mobile_Food_Data.csv"))
                .withCSVParser(parser)
                .build()) {
            String[] data;
            // Skip the header
            reader.readNext();
            int expectedNumberOfFields = 29;

            while ((data = reader.readNext()) != null) {
                System.out.println("Processing line: " + String.join("!", data) + " with length " + data.length);

                if (data.length != expectedNumberOfFields) {
                    System.err.println("Skipping malformed line (incorrect number of fields): "
                            + String.join("!", data)
                            + " Found: " + data.length
                            + ", Expected: " + expectedNumberOfFields);
                    continue;
                }

                try {
                    FoodTruck foodTruck = new FoodTruck();
                    foodTruck.setLocationid(data[0].trim());
                    foodTruck.setApplicant(data[1].trim());
                    foodTruck.setFacilitytype(data[2].trim());
                    foodTruck.setCnn(data[3].trim()); // Keep cnn as String

                    // Debug locationdescription
                    String locationDescription = data[4].trim();
                    System.out.println("Location Description: " + locationDescription);
                    if(locationDescription.equals("undefined") || locationDescription.isEmpty()){
                        System.err.println("Skipping line due to invalid location description: " + locationDescription);
                        continue;
                    }
                    foodTruck.setLocationdescription(locationDescription);

                    foodTruck.setAddress(data[5].trim());
                    foodTruck.setBlocklot(data[6].trim());
                    foodTruck.setBlock(data[7].trim());
                    foodTruck.setLot(data[8].trim());
                    foodTruck.setPermit(data[9].trim());
                    foodTruck.setStatus(data[10].trim());
                    foodTruck.setFooditems(data[11].trim());
                    foodTruck.setX(data[12].trim());
                    foodTruck.setY(data[13].trim());
                    foodTruck.setLatitude(data[14].trim());
                    foodTruck.setLongitude(data[15].trim());
                    foodTruck.setSchedule(data[16].trim());
                    foodTruck.setDayshours(data[17].trim());
                    foodTruck.setNoisSent(data[18].trim());

                    // Handle empty date fields
                    if (!data[19].trim().isEmpty()) {
                        foodTruck.setApproved(LocalDateTime.parse(data[19].trim(), formatter));
                    }

                    foodTruck.setReceived(data[20].trim());
                    foodTruck.setPriorpermit(data[21].trim());

                    // Handle empty date fields
                    if (!data[22].trim().isEmpty()) {
                        foodTruck.setExpirationdate(LocalDateTime.parse(data[22].trim(), formatter));
                    }

                    foodTruck.setLocation(data[23].trim());
                    foodTruck.setFirePreventionDistricts(data[24].trim());
                    foodTruck.setPoliceDistricts(data[25].trim());
                    foodTruck.setSupervisorDistricts(data[26].trim());
                    foodTruck.setZipCodes(data[27].trim());
                    foodTruck.setNeighborhoodsOld(data[28].trim());
                    repository.save(foodTruck);
                    System.out.println("Saved FoodTruck with locationid: " + data[0].trim());
                } catch (Exception e) {
                    System.err.println("Skipping line due to unexpected exception: " + String.join("!", data));
                    e.printStackTrace();
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
