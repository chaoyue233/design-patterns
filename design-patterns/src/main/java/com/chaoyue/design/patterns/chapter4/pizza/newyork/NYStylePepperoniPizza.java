package com.chaoyue.design.patterns.chapter4.pizza.newyork;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "NY Style Pepperoni Dough";
        sauce = "NY Style Pepperoni Sauce";
        toppings.add("NY Style Pepperoni Grated Cheese");
    }
}
