package com.chaoyue.design.patterns.chapter8;

/**
 * 抽象公共的算法为模板方法
 */
abstract class CaffeineBeverage {
    // 定义为final 防止被子类重写（保护模板方法）
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        // 预留的自定义扩展方法 模板方法中什么也不做 子类可以选择性覆盖
        hook();
    }

    // 保护重要的方法 申明为private
    private void boilWater() {
        System.out.println("boilWater");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("pourInCup");
    }

    abstract void addCondiments();

    void hook() {
    }
}
