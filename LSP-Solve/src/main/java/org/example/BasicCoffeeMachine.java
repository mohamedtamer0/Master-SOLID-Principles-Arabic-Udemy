package org.example;

public class BasicCoffeeMachine extends CoffeeMachine {
    @Override
    public void prepare() {
        System.out.println("Making regular coffee...");
    }

}