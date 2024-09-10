package org.example;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat");
    }
}