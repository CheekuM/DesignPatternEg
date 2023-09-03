package com.pizza.topping.cost.toppings;

import com.pizza.topping.cost.BasePizza;

public class ExtraCheeseAndMushroom extends Toppings {
    BasePizza pizza;

    public ExtraCheeseAndMushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+20;
    }
}
