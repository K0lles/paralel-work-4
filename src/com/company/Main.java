package com.company;

public class Main {

    public static void main(String[] args) {
        Main.taskFirst();
    }

    public static void taskFirst() {
        Counter counter = new Counter();
        ProgramFirst programOne = new ProgramFirst(counter, "First");
        ProgramFirst programSecond = new ProgramFirst(counter, "Second");
        programOne.start();
        programSecond.start();
    }
}
