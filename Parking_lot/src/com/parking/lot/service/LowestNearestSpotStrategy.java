package com.parking.lot.service;

import com.parking.lot.VehicleTYPE;
import com.parking.lot.pojo.Floor;
import com.parking.lot.pojo.ParkingLot;
import com.parking.lot.pojo.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class LowestNearestSpotStrategy implements NearestSpotStrategy {
    int truckingParkingFloor = 0;
    int bikeParkingFloor = 0;
    int carParkingFloor = 0;
    ParkingSpot parkingSpot = null;

    List<Integer> occupied;
    List<Integer> free;
    boolean flag;
    @Override
    public ParkingSpot findNearestSpot(ParkingLot parkingLot, VehicleTYPE vehicleTYPE) {
        parkingSpot = null;
        if (vehicleTYPE.equals(VehicleTYPE.TRUCK)) {
            if (truckingParkingFloor < parkingLot.getFloor().size()) {
                parkingSpot = parkingLot.getFloor().get(truckingParkingFloor).getParkingSpotList().get(0);
                occupied = parkingLot.getFloor().get(truckingParkingFloor).getTruckOccupied();
                free = parkingLot.getFloor().get(truckingParkingFloor).getTruckFree();
                free.remove(Integer.valueOf(0));
                occupied.add(0);
                parkingLot.getFloor().get(truckingParkingFloor).setTruckOccupied(occupied);
                parkingLot.getFloor().get(truckingParkingFloor).setTruckFree(free);
                truckingParkingFloor++;
            }
        } else if (vehicleTYPE.equals(VehicleTYPE.BIKE)) {
            while (bikeParkingFloor < parkingLot.getFloor().size()) {

                if (parkingLot.getFloor().get(bikeParkingFloor).getParkingSpotList().get(1).isAvailable()) {
                    parkingSpot = parkingLot.getFloor().get(bikeParkingFloor).getParkingSpotList().get(1);
                    break;
                } else if (parkingLot.getFloor().get(bikeParkingFloor).getParkingSpotList().get(2).isAvailable()) {
                    parkingSpot = parkingLot.getFloor().get(bikeParkingFloor).getParkingSpotList().get(2);
                    break;
                }
                bikeParkingFloor++;
            }
            if (parkingSpot != null){
                occupied=parkingLot.getFloor().get(parkingSpot.getFloordId()).getBikeOccupied();
                free= parkingLot.getFloor().get(parkingSpot.getFloordId()).getBikeFree();
                free.remove(Integer.valueOf(parkingSpot.getId()));
                occupied.add(Integer.valueOf(parkingSpot.getId()));
                parkingLot.getFloor().get(parkingSpot.getFloordId()).setBikeFree(free);
                parkingLot.getFloor().get(parkingSpot.getFloordId()).setBikeOccupied(occupied);
            }
        } else if (vehicleTYPE.equals(VehicleTYPE.CAR)) {
            while (carParkingFloor < parkingLot.getFloor().size()) {
                
                flag=false;
                for (int i = 3; i < parkingLot.getFloor().get(carParkingFloor).getNumberOfSlots(); i++) {
                    if (parkingLot.getFloor().get(carParkingFloor).getParkingSpotList().get(i).isAvailable()) {
                        parkingSpot = parkingLot.getFloor().get(carParkingFloor).getParkingSpotList().get(i);
                        //System.out.println("Car PArked :"+i);
                        flag=true;
                        break;
                    }
                }
                if(flag) break;
                carParkingFloor++;
            }
            if(parkingSpot != null){
                free = parkingLot.getFloor().get(parkingSpot.getFloordId()).getCarFree();
                occupied= parkingLot.getFloor().get(parkingSpot.getFloordId()).getCarOccupied();
                free.remove(Integer.valueOf(parkingSpot.getId()));
                occupied.add(Integer.valueOf(parkingSpot.getId()));
                parkingLot.getFloor().get(parkingSpot.getFloordId()).setCarFree(free);
                parkingLot.getFloor().get(parkingSpot.getFloordId()).setCarOccupied(occupied);
            }
        }
        return parkingSpot;
    }
}
