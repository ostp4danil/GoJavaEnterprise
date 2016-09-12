package com.goit.gojavaonline.enterprise.semaphore;

import java.util.concurrent.Semaphore;

public class Consumer extends Thread{

    public Semaphore semaphore;

    public Consumer(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {
        int index = 0;
        while (true) {
            try {
                System.out.println("\t" + ++index + "Consumer");
                semaphore.acquire();
                Thread.sleep(3000);
                System.out.println("\t" + index + "Consumer release");
                semaphore.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
