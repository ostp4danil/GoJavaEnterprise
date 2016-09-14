package com.goit.gojavaonline.enterprise.semaphore;

/**
 * Created by Danil-MAC on 9/9/16.
 */
public interface MySemaphore {
    public void acquire();
    public void acquire(int permits);
    public void release();
    public void release(int permits) throws InterruptedException;
}
