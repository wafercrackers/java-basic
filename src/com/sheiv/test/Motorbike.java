package com.sheiv.test;

public class Motorbike extends Vehicle{

    public Motorbike (int wheels, String color) {
        super(wheels, color);
        System.out.println(getColor());
        System.out.println(getWheels());
    }

    @Override
    public void activateBrake() {
        System.out.println("Motor Brake");
    }
}
