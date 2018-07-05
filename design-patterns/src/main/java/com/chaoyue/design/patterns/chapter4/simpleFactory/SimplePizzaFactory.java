package com.chaoyue.design.patterns.chapter4.simpleFactory;

import com.chaoyue.design.patterns.chapter4.pizza.CheesePizza;
import com.chaoyue.design.patterns.chapter4.pizza.PepperoniPizza;
import com.chaoyue.design.patterns.chapter4.pizza.Pizza;
import com.chaoyue.design.patterns.chapter4.pizza.VeggiePizza;

/**
 * 简单工厂方法
 * 并不是一个真正的设计模式 应该说是一种编程习惯
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
