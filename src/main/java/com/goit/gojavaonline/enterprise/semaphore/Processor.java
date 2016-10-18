package com.goit.gojavaonline.enterprise.semaphore;

/**
 * Created by Danil-MAC on 9/9/16.
 */
public class Processor extends Thread {
    private MySemaphore mySemaphore;
    private String name;

    public Processor (MySemaphore mySemaphore, String name){
        this.name = name;
        this.mySemaphore = mySemaphore;
    }

    public void run(){
        mySemaphore.acquire();
        System.out.println(name + ".acquire()");
        try {
            Thread.sleep(500);
            mySemaphore.release();
            System.out.println("\t" + name + ".release()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
