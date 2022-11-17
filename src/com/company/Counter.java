package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class Counter{
    private int c = 0;

    public void increment() throws InterruptedException {
        int a;
        sleep(1500);
        a = c;
        a++;
        c = a;
    }

    public void decrement() throws InterruptedException {
        int a;
        sleep(2000);
        a = c;
        a--;
        c = a;
    }

    public int value() {
        return c;
    }
}
