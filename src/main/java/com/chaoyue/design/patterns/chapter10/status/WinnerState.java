package com.chaoyue.design.patterns.chapter10.status;

import com.chaoyue.design.patterns.chapter10.GumballMachine;

/**
 * 玩游戏获胜 一次性出货两个糖果 于 SoldState 很像 只是售出两科而已
 * 但是并不推荐用 SoldOutStatus 来直接进行服用 这样状态会产生混淆 不利于之后的需求扩展
 */
public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You have two gumball to dispense,get you gumball first");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank now");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get tow gumballs for you quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }

    }
}
