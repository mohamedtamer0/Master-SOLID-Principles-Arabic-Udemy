package org.example;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb is turned off");
    }
}