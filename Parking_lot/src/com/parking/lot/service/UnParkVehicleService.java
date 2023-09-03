package com.parking.lot.service;

import com.parking.lot.pojo.Floor;
import com.parking.lot.pojo.ParkingLot;
import com.parking.lot.pojo.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class UnParkVehicleService {

    List<Integer> free = new ArrayList<>();
    List<Integer> occupied = new ArrayList<>();

    public void unParkVehicle(ParkingLot parkingLot, String id) {
        String[] strings = id.split("_");

        if (Integer.parseInt(strings[1]) - 1 >= parkingLot.getFloor().size() || Integer.parseInt(strings[2]) - 1 >= parkingLot.getFloor().get(0).getParkingSpotList().size() || parkingLot.getFloor().get(Integer.parseInt(strings[1]) - 1).getParkingSpotList().get(Integer.parseInt(strings[2]) - 1).isAvailable()) {
            System.out.println("Invalid Ticket");
        } else {
            ParkingSpot parkingSpot = parkingLot.getFloor().get(Integer.parseInt(strings[1]) - 1).getParkingSpotList().get(Integer.parseInt(strings[2]) - 1);
            parkingSpot.setAvailable(true);
            Floor floor = parkingLot.getFloor().get(Integer.parseInt(strings[1]) - 1);
            if (parkingSpot.getVehicle().getVehicleTYPE().equals("CAR")) {
                free = floor.getCarFree();
                occupied = floor.getCarOccupied();
            } else if (parkingSpot.getVehicle().getVehicleTYPE().equals("TRUCK")) {
                free = floor.getTruckFree();
                occupied = floor.getTruckOccupied();

            } else if (parkingSpot.getVehicle().getVehicleTYPE().equals("BIKE")) {
                free = floor.getBikeFree();
                occupied = floor.getBikeOccupied();

            }
            occupied.remove(Integer.valueOf(Integer.valueOf(strings[2]) - 1));
            free.add(Integer.valueOf(Integer.valueOf(strings[2]) - 1));
            floor.setCarOccupied(occupied);
            floor.setCarFree(free);
            System.out.println("Unparked vehicle with Registration Number: " + parkingSpot.getVehicle().getRegistrationNumber() + " and Color: " + parkingSpot.getVehicle().getColor());
        }
    }
}
