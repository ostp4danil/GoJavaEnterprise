package com.goit.gojavaonline.enterprise.semaphore;

/**
 * Created by Danil-MAC on 9/9/16.
 */
public class main {
    public static void main(String[] args) {
        MySemaphore mySemaphore = new MySemaphoreImpl(5);
        for (int i =0 ; i <30; i++){
            Processor p = new Processor(mySemaphore, "P"+i);
            p.start();
        }

    }
}
