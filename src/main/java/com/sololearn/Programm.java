package com.sololearn;

public class Programm {

    public static class A {
        public String a1;

        public A(String a1) {

        }

    }

    public static void main(String[] args) {
        A a = new A("1");
        A c = a;
        a = new A("3");
        System.out.print(a.a1);
        System.out.print(c.a1);

    }

}