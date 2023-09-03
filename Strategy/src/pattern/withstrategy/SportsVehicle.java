package pattern.withstrategy;

import pattern.withstrategy.drive.SpecialDrive;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(){
        super(new SpecialDrive());
    }

}
