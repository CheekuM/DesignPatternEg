package com.parking.lot.service;

import com.parking.lot.pojo.ParkingLot;
import com.parking.lot.pojo.Ticket;

public class ParkingLotService {

    public ParkingLot createParkingLot(String id, int numberOfFloors, int numberOfSlotsPerFloor){
        return new ParkingLot(id,numberOfFloors,numberOfSlotsPerFloor);
    }
}
