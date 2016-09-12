package com.goit.gojavaonline.enterprise.semaphore;

import java.util.concurrent.Semaphore;

public class Producer extends Thread {

    public Semaphore semaphore;
    String name;

    public Producer(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    public void run() {
        System.out.println("Producer run");
        try {
            semaphore.acquire();
            System.out.println(name + "Produce.acquire");
            Thread.sleep(10000);
            semaphore.release();
            System.out.println(name + "Producer release");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
