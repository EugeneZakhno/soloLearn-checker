package com.sololearn;

class MyThread extends Thread {
    public void run(int i) {

    }
}

public class ProgramThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

// no output