package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Main.taskFirst();
    }

    public static void taskFirst() throws InterruptedException {
        Counter counter = new Counter();
        ProgramFirst programOne = new ProgramFirst(counter, "First");
        ProgramFirst programSecond = new ProgramFirst(counter, "Second");
        programOne.start();
        programSecond.start();
    }

    public static void taskSecond() throws InterruptedException {
        CounterLocked counter = new CounterLocked();
        ProgramFirst programOne = new ProgramFirst(counter, "First");
        ProgramFirst programSecond = new ProgramFirst(counter, "Second");
        programOne.start();
        programSecond.start();
    }
}
