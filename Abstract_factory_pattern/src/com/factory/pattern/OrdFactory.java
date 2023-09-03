package com.factory.pattern;

public class OrdFactory implements CarFactory{


    @Override
    public Vehicle getCar(String input) {
        switch(input){
            case "ord1":{
                return new Ord1Car();
            }
            case "ord2":{
                return new Ord2Car();
            }
        }
        return null;
    }
}
