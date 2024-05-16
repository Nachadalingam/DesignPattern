package com.example.parkinglot.model;

public class ParkingSpot {
    private int spotNumber;
    private Car parkedCar;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void parkCar(Car car) {
        this.parkedCar = car;
    }

    public void removeCar() {
        this.parkedCar = null;
    }
}