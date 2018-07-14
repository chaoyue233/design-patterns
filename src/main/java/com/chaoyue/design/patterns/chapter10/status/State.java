package com.chaoyue.design.patterns.chapter10.status;

/**
 * 定义公共的状态抽象接口
 */
public interface State {
    // 投币
    void insertQuarter();

    // 弹出硬币
    void ejectQuarter();

    // 转动手柄
    void turnCrank();

    // 分配糖果
    void dispense();
}
