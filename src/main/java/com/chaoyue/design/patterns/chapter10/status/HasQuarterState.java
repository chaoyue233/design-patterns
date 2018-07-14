package com.chaoyue.design.patterns.chapter10.status;

import com.chaoyue.design.patterns.chapter10.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {
    // 设置一个随机数产生器 产生10%的 掉落两次糖果的机会
    private Random randomWinner = new Random(System.currentTimeMillis());

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("quarter ejected");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("you turned...");
        // 转动手柄的时候判断是否获得了赢得两颗糖果的机会
        int winner = randomWinner.nextInt(10);
        // 如果获胜 且 糖果机内糖果剩余数量还有两颗以上，则设置状态为获胜状态
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            // 否则视为普通的贩卖处理 客户无感知是winner
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
