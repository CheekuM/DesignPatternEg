package pattern.withstrategy;

import pattern.withstrategy.drive.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialDrive());
    }
}
