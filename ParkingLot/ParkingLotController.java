package com.example.parkinglot.controller;

import com.example.parkinglot.model.Car;
import com.example.parkinglot.model.ParkingSpot;
import com.example.parkinglot.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingLotController {
    @Autowired
    private ParkingLotService parkingLotService;

    @PostMapping("/park")
    public String parkCar(@RequestBody Car car) {
        ParkingSpot spot = parkingLotService.parkCar(car);
        if (spot != null) {
            return "Car parked successfully in spot number: " + spot.getSpotNumber();
        } else {
            return "Parking lot is full";
        }
    }

    @DeleteMapping("/retrieve/{registrationNumber}")
    public String retrieveCar(@PathVariable String registrationNumber) {
        if (parkingLotService.retrieveCar(registrationNumber)) {
            return "Car retrieved successfully";
        } else {
            return "Car with registration number " + registrationNumber + " not found";
        }
    }

    @GetMapping("/availability")
    public String getAvailability() {
        return "Available spaces: " + parkingLotService.getAvailableSpaces();
    }
}
