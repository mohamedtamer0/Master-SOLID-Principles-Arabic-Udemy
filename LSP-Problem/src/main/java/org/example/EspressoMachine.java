package org.example;

public class EspressoMachine extends CoffeeMachine {
    @Override
    public void makeCoffee() {
        throw new UnsupportedOperationException("EspressoMachine doesn't support regular coffee!");
    }
}