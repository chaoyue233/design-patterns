package com.chaoyue.design.patterns.chapter4.factory;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;

public class GetPizza {
    public static void main(String[] args) {
        System.out.println("I'm from NY");
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(nyPizza.getName());
        System.out.println("I'm from chicago");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println(chicagoPizza.getName());
    }
}
