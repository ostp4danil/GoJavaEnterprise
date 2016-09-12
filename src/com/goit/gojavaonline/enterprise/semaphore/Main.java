package com.goit.gojavaonline.enterprise.semaphore;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 30; i++) {
            Thread p = new Producer(semaphore, "Intem#" + i);
            p.start();
        }
    }
}

