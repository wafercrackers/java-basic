package com.sheiv.test;

public class Vehicle {

    public String test = "test";
    private int wheels;
    private String color;

    public Vehicle (int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public void activateBrake() {
        System.out.println("Vehicle Brake");
    }
}
