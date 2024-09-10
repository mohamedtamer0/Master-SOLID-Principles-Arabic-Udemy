package org.example;

public class Main {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);
        lightSwitch.operate();
    }
}