package com.parking.lot.service;

import com.parking.lot.VehicleTYPE;
import com.parking.lot.pojo.ParkingLot;

public class OccupiedSlotService {
    
    public void getOccupiedSlot(ParkingLot parkingLot, String vehicleType){
        if (vehicleType.equalsIgnoreCase("CAR")) {
            for (int i = 0; i < parkingLot.getFloor().size(); i++) {

                System.out.print("Occupied slots for " + VehicleTYPE.CAR + " on Floor " + (i + 1) + ":");
                if (parkingLot.getFloor().get(i).getCarOccupied().size() > 0) {
                    for (int j = 0; j < parkingLot.getFloor().get(i).getCarOccupied().size() - 1; j++) {
                        System.out.print(parkingLot.getFloor().get(i).getCarOccupied().get(j) + ",");
                    }
                    System.out.print(parkingLot.getFloor().get(i).getCarOccupied().get(parkingLot.getFloor().get(i).getCarOccupied().size() - 1));
                    System.out.println();
                } else {
                    System.out.print(0);
                    System.out.println();
                }
            }
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            for (int i = 0; i < parkingLot.getFloor().size(); i++) {
                System.out.print("Occupied slots for " + VehicleTYPE.BIKE + " on Floor " + (i + 1) + ":");
                if (parkingLot.getFloor().get(i).getBikeOccupied().size() > 0) {
                    for (int j = 0; j < parkingLot.getFloor().get(i).getBikeOccupied().size() - 1; j++) {
                        System.out.print(parkingLot.getFloor().get(i).getBikeOccupied().get(j) + ",");
                    }
                    System.out.print(parkingLot.getFloor().get(i).getBikeOccupied().get(parkingLot.getFloor().get(i).getBikeOccupied().size() - 1));
                } else {
                    System.out.print(0);
                }
                System.out.println();
            }
        } else if (vehicleType.equalsIgnoreCase("TRUCK")) {
            for (int i = 0; i < parkingLot.getFloor().size(); i++) {
                System.out.print("Occupied slots for " + VehicleTYPE.TRUCK + " on Floor " + (i + 1) + ":");
                if (parkingLot.getFloor().get(i).getTruckOccupied().size() > 0) {
                    for (int j = 0; j < parkingLot.getFloor().get(i).getTruckOccupied().size() - 1; j++) {
                        System.out.print(parkingLot.getFloor().get(i).getTruckOccupied().get(j) + ",");
                    }
                    System.out.print(parkingLot.getFloor().get(i).getTruckOccupied().get(parkingLot.getFloor().get(i).getTruckOccupied().size() - 1));
                } else {
                    System.out.print(0);
                }
                System.out.println();
            }
        }
    }
    
}
