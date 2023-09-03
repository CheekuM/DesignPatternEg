package com.pizza.topping.cost.toppings;

import com.pizza.topping.cost.BasePizza;

public class Jalpenno extends Toppings {

    BasePizza pizza;
    public Jalpenno(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+10;
    }
}
