package com.pizza.topping.cost.toppings;

import com.pizza.topping.cost.BasePizza;

public class ExtraCheese extends Toppings {
    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public int cost() {
        return pizza.cost() + 5;
    }
}
