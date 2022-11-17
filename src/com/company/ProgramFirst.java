package com.company;

public class ProgramFirst extends Thread {
    public Counter counter;
    public String nameProgram;

    public ProgramFirst(Counter counter, String nameProgram) {
        this.counter = counter;
        this.nameProgram = nameProgram;
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            try {
                this.counter.increment();
                System.out.println(this.nameProgram + " program counter: " + this.counter.value());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
