package pattern.withstrategy;


import pattern.withstrategy.drive.NormalDrive;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new NormalDrive());
    }
}
