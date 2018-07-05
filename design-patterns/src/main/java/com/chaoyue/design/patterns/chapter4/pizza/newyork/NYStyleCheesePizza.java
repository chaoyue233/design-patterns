package com.chaoyue.design.patterns.chapter4.pizza.newyork;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Thin Cruse Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Cheese");
    }
}
