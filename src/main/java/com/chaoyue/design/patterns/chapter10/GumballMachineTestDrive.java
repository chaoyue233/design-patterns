package com.chaoyue.design.patterns.chapter10;

/**
 * 状态模式 State Pattern
 * 允许对象在内部状态改变时改变它的行为 对象看起来好像修改了它的类
 * demo 说明
 * 首先将所有的状态 和 行为 抽象出来 在 状态中实现所有的行为 其实就是用笛卡尔积处理状态与行为之间的关系
 * 但是 例子中只是但实例的情况 ，对于实际使用中常见的多实例情况 并不能保证
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        // 开始装载5颗糖果
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);
        System.out.println("投币 买一个颗糖果");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        System.out.println("继续投币。。。");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
