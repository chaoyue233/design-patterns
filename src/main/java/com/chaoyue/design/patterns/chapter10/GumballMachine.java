package com.chaoyue.design.patterns.chapter10;

import com.chaoyue.design.patterns.chapter10.status.*;

/**
 * 状态模式demo 抽象出具体的状态 并将动作委托到代表当前状态的对象
 */
public class GumballMachine {
    // 定义出糖果机所有可能的状态 并初始化默认状态
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;
    // 默认状态为没有糖果
    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        // 如果剩余糖果数量大于0 则状态置为没有投币状态 即可以贩卖糖果
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("a gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine count:" + count + " status: " + state.getClass();
    }
}
