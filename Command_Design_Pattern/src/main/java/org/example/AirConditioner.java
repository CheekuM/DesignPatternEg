package org.example;

public class AirConditioner {
    private boolean isOn;
    private int temp;

    public void turnOn() {
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.println("Temperature is set to "+temp);
    }

}
