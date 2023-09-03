package com.parking.lot.pojo;


public class ParkingSpot {
    int id;
    int floordId;
    boolean isAvailable;

    Vehicle vehicle;

    public int getFloordId() {
        return floordId;
    }

    public void setFloordId(int floordId) {
        this.floordId = floordId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot(int id, int floorId, boolean isAvailable) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.floordId = floorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
