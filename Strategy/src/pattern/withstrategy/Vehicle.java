package pattern.withstrategy;

import pattern.withstrategy.drive.Drive;

public class Vehicle {

    Drive drive;
    Vehicle(Drive drive){
        this.drive=drive;
    }

    public void drive(){
        drive.drive();
    }

}
