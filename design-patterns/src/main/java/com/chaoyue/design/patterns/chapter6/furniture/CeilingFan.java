package com.chaoyue.design.patterns.chapter6.furniture;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling Fan in  " + location + " is high speed");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling Fan in  " + location + " is medium speed");
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling Fan in  " + location + " is low speed");
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling Fan in  " + location + " is off");
    }

    public int getSpeed() {
        return speed;
    }
}
