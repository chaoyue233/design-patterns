package com.chaoyue.design.patterns.chapter2;

/**
 * 布告板 作为观察者 通过update方法接受主题的变更推送
 * 观察者中也需要包含主题，即需要确定订阅的是哪个主题 并进行订阅和取消订阅操作
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;


    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
