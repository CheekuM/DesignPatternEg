package org.example;

public class TurnOnACCommand implements ICommand {
    AirConditioner airConditioner;

    TurnOnACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
        airConditioner.setTemp(20);
    }
}
