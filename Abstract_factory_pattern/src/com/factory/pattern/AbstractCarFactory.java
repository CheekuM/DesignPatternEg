package com.factory.pattern;

public class AbstractCarFactory {
    public CarFactory getCar(String input){
        if(input.equals("LUX"))
            return new LuxFactory();
        else
            return new OrdFactory();
    }
}
