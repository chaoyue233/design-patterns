package com.chaoyue.design.patterns.chapter10.status;

import com.chaoyue.design.patterns.chapter10.GumballMachine;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Gumball sold out! You can't get any gumball");
    }

    public void ejectQuarter() {
        System.out.println("No Quarter to eject");
    }

    public void turnCrank() {
        System.out.println("Gumball sold out, you can't turn crank");
    }

    public void dispense() {
        System.out.println("Gumball sold out, nothing to dispense");
    }
}
