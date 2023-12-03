package org.example;

public class TurnOffACCommand implements ICommand {
    AirConditioner airConditioner;

    TurnOffACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
