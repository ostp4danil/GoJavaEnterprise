package com.goit.gojavaonline.enterprise.semaphore;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Danil-MAC on 9/9/16.
 */
public class MySemaphoreImpl implements MySemaphore {

    private AtomicInteger permits;
    private AtomicInteger currentPoolSize;

    public MySemaphoreImpl(int permits) {
        this.permits = new AtomicInteger(permits);
        this.currentPoolSize = new AtomicInteger();
    }

    @Override
    public void acquire() {
        while (currentPoolSize.get() == permits.get()) {
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        currentPoolSize.incrementAndGet();
    }

    @Override
    public void acquire(int permits) {
        while (currentPoolSize.get() == permits) {
            synchronized (this) {
                try {
                    if (permits > currentPoolSize.get()){
                        wait();
                    }
                    while (currentPoolSize.get() == permits) {
                        acquire();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        currentPoolSize.incrementAndGet();
    }

    @Override
    public void release() {
        currentPoolSize.decrementAndGet();
        synchronized (this) {
            notifyAll();
        }
    }

    @Override
    public void release(int permits) throws InterruptedException {
        if (permits>currentPoolSize.get()){
            throw new InterruptedException();
        }
        currentPoolSize.set(currentPoolSize.get()-permits);
        release();
    }
}
