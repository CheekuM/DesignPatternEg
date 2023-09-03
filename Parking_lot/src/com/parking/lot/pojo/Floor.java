package com.parking.lot.pojo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Floor {
    int id;
    int numberOfSlots;
    List<ParkingSpot> parkingSpotList;
    List<Integer> truckOccupied;
    List<Integer> bikeOccupied;
    List<Integer> carOccupied;

    List<Integer> truckFree;
    List<Integer> carFree;
    List<Integer> bikeFree;

    public List<Integer> getTruckOccupied() {
        return truckOccupied;
    }

    public void setTruckOccupied(List<Integer> truckOccupied) {
        this.truckOccupied = truckOccupied;
    }

    public List<Integer> getBikeOccupied() {
        return bikeOccupied;
    }

    public void setBikeOccupied(List<Integer> bikeOccupied) {
        this.bikeOccupied = bikeOccupied;
    }

    public List<Integer> getCarOccupied() {
        return carOccupied;
    }

    public void setCarOccupied(List<Integer> carOccupied) {
        this.carOccupied = carOccupied;
    }

    public List<Integer> getTruckFree() {
        return truckFree;
    }

    public void setTruckFree(List<Integer> truckFree) {
        this.truckFree = truckFree;
    }

    public List<Integer> getCarFree() {
        return carFree;
    }

    public void setCarFree(List<Integer> carFree) {
        this.carFree = carFree;
    }

    public List<Integer> getBikeFree() {
        return bikeFree;
    }

    public void setBikeFree(List<Integer> bikeFree) {
        this.bikeFree = bikeFree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    Floor(int id, int numberOfSlots) {
        this.id = id;
        this.numberOfSlots = numberOfSlots;
        truckFree = new ArrayList<>();
        bikeFree = new ArrayList<>();
        carFree = new ArrayList<>();
        truckOccupied = new ArrayList<>();
        bikeOccupied = new ArrayList<>();
        carOccupied = new ArrayList<>();
        this.parkingSpotList = new ArrayList<>();
        this.initialize();

    }

    public void initialize() {
        for (int i = 0; i < numberOfSlots; i++) {
            parkingSpotList.add(new ParkingSpot(i, id, true));
            if( i == 0) truckFree.add(i);
            else if(i == 1|| i ==2) bikeFree.add(i);
            else if(i>2) carFree.add(i);
        }

    }
}
