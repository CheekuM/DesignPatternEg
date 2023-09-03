package com.factory.pattern;

public class LuxFactory implements CarFactory{

    @Override
    public Vehicle getCar(String input) {
        switch (input){
            case "lux1":{
                return new Lux1Car();
            }
            case "lux2":{
                return new Lux2Car();
            }
        }
        return null;
    }
}
