package com.parking.lot.pojo;

import com.parking.lot.VehicleTYPE;

public class Vehicle {
    String registrationNumber;
    VehicleTYPE vehicleTYPE;
    String color;

    public Vehicle(String registrationNumber, VehicleTYPE vehicleTYPE, String color) {
        this.registrationNumber = registrationNumber;
        this.vehicleTYPE = vehicleTYPE;
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleTYPE getVehicleTYPE() {
        return vehicleTYPE;
    }

    public void setVehicleTYPE(VehicleTYPE vehicleTYPE) {
        this.vehicleTYPE = vehicleTYPE;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
