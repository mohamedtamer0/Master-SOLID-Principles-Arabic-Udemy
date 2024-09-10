package org.example;

public class Main {
    public static void main(String[] args) {
        Workable[] workers = {new Robot(), new Human()};
        Eatable[] eaters = {new Human()};

        for (Workable worker : workers) {
            worker.work();
        }

        for (Eatable eater : eaters) {
            eater.eat();
        }
    }
}