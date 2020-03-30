package com.sololearn;

    class A {
        static int num = 5;
        public void setNum(int setTo)
        {
            num = setTo;
        }
    }
    public class MainAppleOrange {

        static A apple = new A();
        static A orange = new A();

        public static void main(String[] args) {
            apple.setNum(16);
            orange.setNum(17);
            System.out.print(apple.num);
            System.out.print(orange.num);
        }
    }
//Output 1717
