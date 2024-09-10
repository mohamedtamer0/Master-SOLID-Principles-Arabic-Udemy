package org.example;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine[] machines = { new BasicCoffeeMachine(), new EspressoMachine() };

        for (CoffeeMachine machine : machines) {
            machine.makeCoffee();
        }
    }
}