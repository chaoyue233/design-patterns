package com.chaoyue.design.patterns.chapter4.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;//生面团
    protected String sauce;//沙司
    protected ArrayList<String> toppings = new ArrayList<String>();//佐料

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough...");
        System.out.println("adding sauce...");
        System.out.println("add toppings :" + toppings.toString());
    }

    public void bake() {
        System.out.println("bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("place pizza in official pizzaStore box");
    }

    public String getName() {
        return name;
    }
}
