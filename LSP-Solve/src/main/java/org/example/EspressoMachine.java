package org.example;

public class EspressoMachine extends CoffeeMachine {

    @Override
    public void prepare() {
        System.out.println("Making espresso...");
    }
}