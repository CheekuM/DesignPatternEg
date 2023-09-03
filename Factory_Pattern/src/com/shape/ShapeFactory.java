package com.shape;

public class ShapeFactory {

    public Shape getShape(String shape){
        switch (shape){
            case "CIRCLE":{
                return new Circle();
            }
            case "SQUARE":{
                return new Square();
            }
            case "RECTANGLE": {
                return new Rectangle();
            }
        }
        return null;
    }
}
