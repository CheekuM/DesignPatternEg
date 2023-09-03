package com.parking.lot.service;

import com.parking.lot.VehicleTYPE;
import com.parking.lot.pojo.ParkingLot;

public class FreeSlotService {
    public void getFreeSlot(ParkingLot parkingLot, String vehicleType) {
        if (vehicleType.equalsIgnoreCase("CAR")) {
            for (int i = 0; i < parkingLot.getFloor().size(); i++) {
                System.out.print("Free slots for " + VehicleTYPE.CAR + " on Floor " + (i + 1) + ": ");
                if (parkingLot.getFloor().get(i).getCarFree().size() > 0) {
                    for (int j = 0; j < parkingLot.getFloor().get(i).getCarFree().size() - 1; j++) {
                        System.out.print((parkingLot.getFloor().get(i).getCarFree().get(j) + 1) + ",");
                    }
                    System.out.print(parkingLot.getFloor().get(i).getCarFree().get(parkingLot.getFloor().get(i).getCarFree().size() - 1) + 1);
                } else {
                    System.out.print(0);
                }
                System.out.println();
            }
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            for (int i = 0; i < parkingLot.getFloor().size(); i++) {
                System.out.print("Free slots for " + VehicleTYPE.BIKE + " on Floor " + (i + 1) + ": ");
                if (parkingLot.getFloor().get(i).getBikeFree().size() > 0) {
                    for (int j = 0; j < parkingLot.getFloor().get(i).getBikeFree().size() - 1; j++) {
                        System.out.print((parkingLot.getFloor().get(i).getBikeFree().get(j) + 1) + ",");
                    }
                    System.out.print(parkingLot.getFloor().get(i).getBikeFree().get(parkingLot.getFloor().get(i).getBikeFree().size() - 1) + 1);
                } else {
                    System.out.print(0);
                }
                System.out.println();
            }
        } else if (vehicleType.equalsIgnoreCase("TRUCK")) {
            for (int i = 0; i < parkingLot.getFloor().size(); i++) {
                System.out.print("Free slots for " + VehicleTYPE.TRUCK + " on Floor " + (i + 1) + ": ");
                if (parkingLot.getFloor().get(i).getTruckFree().size() > 0) {
                    for (int j = 0; j < parkingLot.getFloor().get(i).getTruckFree().size() - 1; j++) {
                        System.out.print((parkingLot.getFloor().get(i).getTruckFree().get(j) + 1) + ",");
                    }
                    System.out.print((parkingLot.getFloor().get(i).getTruckFree().get(parkingLot.getFloor().get(i).getTruckFree().size() - 1) + 1));
                } else {
                    System.out.print(0);
                }
                System.out.println();
            }
        }
    }
}
