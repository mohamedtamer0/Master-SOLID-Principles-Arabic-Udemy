package org.example;

public class Main {
    public static void main(String[] args) {
        Workable[] workers = { new Robot(), new Human() };

        for (Workable worker : workers) {
            worker.work();
            worker.eat();
        }
    }
}