package org.example;

public class TurnOnBulb implements ICommand{
    Bulb bulb;
    TurnOnBulb(Bulb bulb){
        this.bulb=bulb;
    }


    @Override
    public void execute() {
        bulb.turnOn();
    }
}
