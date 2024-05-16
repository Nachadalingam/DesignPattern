package com.example.parkinglot.repository;

import com.example.parkinglot.model.ParkingSpot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ParkingLotRepository {
    private List<ParkingSpot> parkingSpots;

    public ParkingLotRepository(int capacity) {
        this.parkingSpots = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            this.parkingSpots.add(new ParkingSpot(i + 1));
        }
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
