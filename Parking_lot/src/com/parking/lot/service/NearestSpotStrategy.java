package com.parking.lot.service;

import com.parking.lot.VehicleTYPE;
import com.parking.lot.pojo.ParkingLot;
import com.parking.lot.pojo.ParkingSpot;

public interface NearestSpotStrategy {
    public ParkingSpot findNearestSpot(ParkingLot parkingLot, VehicleTYPE vehicleTYPE);
}
