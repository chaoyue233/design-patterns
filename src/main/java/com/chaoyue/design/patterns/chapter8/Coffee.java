package com.chaoyue.design.patterns.chapter8;

class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("brew Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("addCondiments for Coffee");
    }
}
