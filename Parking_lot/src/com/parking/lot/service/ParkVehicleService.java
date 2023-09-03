package com.parking.lot.service;

import com.parking.lot.VehicleTYPE;
import com.parking.lot.pojo.ParkingLot;
import com.parking.lot.pojo.ParkingSpot;
import com.parking.lot.pojo.Ticket;
import com.parking.lot.pojo.Vehicle;

public class ParkVehicleService {

    NearestSpotStrategy nearestSpotStrategy = new LowestNearestSpotStrategy();
    Ticket ticket;

    public void parkVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        ParkingSpot parkingSpot = nearestSpotStrategy.findNearestSpot(parkingLot, vehicle.getVehicleTYPE());
        System.out.println("");
        if(parkingSpot == null){
            System.out.println("Parking Lot Full");
            return;
        }
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setAvailable(false);
        ticket=new Ticket();
        ticket.setId(parkingLot.getId()+"_"+parkingSpot.getFloordId()+"_"+parkingSpot.getId());
        System.out.println("Parked vehicle. Ticket ID:"+ ticket.getId());
    }

}
