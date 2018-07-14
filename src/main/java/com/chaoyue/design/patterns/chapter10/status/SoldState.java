package com.chaoyue.design.patterns.chapter10.status;

import com.chaoyue.design.patterns.chapter10.GumballMachine;

public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry,you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            // 如果销售完糖果还有糖果 设置为未投币状态
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            // 设置为售罄状态
            System.out.println("Oops, out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
