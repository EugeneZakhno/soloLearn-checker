package com.sololearn;

public class Runner {
    //   What is the output of this code?
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        while (x + y <= 9) {
            if (x * 3 > y) {
                y++;
            } else {
                x++;
            }
        }
        System.out.print(x);
    }
}
