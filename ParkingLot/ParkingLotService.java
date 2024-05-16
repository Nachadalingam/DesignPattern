package com.example.parkinglot.service;

import com.example.parkinglot.model.Car;
import com.example.parkinglot.model.ParkingSpot;
import com.example.parkinglot.repository.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotService {
    @Autowired
    private ParkingLotRepository parkingLotRepository;

    public ParkingSpot parkCar(Car car) {
        List<ParkingSpot> parkingSpots = parkingLotRepository.getParkingSpots();
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getParkedCar() == null) {
                spot.parkCar(car);
                return spot;
            }
        }
        return null; // No available spot
    }

    public boolean retrieveCar(String registrationNumber) {
        List<ParkingSpot> parkingSpots = parkingLotRepository.getParkingSpots();
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getParkedCar() != null && spot.getParkedCar().getRegistrationNumber().equals(registrationNumber)) {
                spot.removeCar();
                return true;
            }
        }
        return false; // Car not found
    }

    public int getAvailableSpaces() {
        List<ParkingSpot> parkingSpots = parkingLotRepository.getParkingSpots();
        int count = 0;
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getParkedCar() == null) {
                count++;
            }
        }
        return count;
    }
}

