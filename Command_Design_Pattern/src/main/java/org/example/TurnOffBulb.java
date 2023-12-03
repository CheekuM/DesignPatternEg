package org.example;

public class TurnOffBulb implements ICommand{
    Bulb bulb;
    TurnOffBulb(Bulb bulb){
        this.bulb=bulb;
    }
    @Override
    public void execute() {
        bulb.turnOff();
    }
}
