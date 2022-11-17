package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class CounterLocked extends Counter {
    private int c = 0;
    final ReentrantLock lock = new ReentrantLock();

    public void increment() throws InterruptedException {
        try {
            boolean isLocked = lock.tryLock(1, TimeUnit.SECONDS);
            if (isLocked) {
                try {
                    int a;
                    sleep(950);
                    a = c;
                    a++;
                    c = a;
                } finally {
                    lock.unlock();
                }
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void decrement() throws InterruptedException {
        try {
            boolean isLocked = lock.tryLock(1, TimeUnit.SECONDS);
            if (isLocked) {
                try {
                    int a;
                    sleep(2000);
                    a = c;
                    a--;
                    c = a;
                } finally {
                    lock.unlock();
                }
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public int value() {
        return c;
    }
}
