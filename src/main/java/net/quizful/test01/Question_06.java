package net.quizful.test01;

public class Question_06 {

        public static void main(String[] str) {
            outer:
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("Hello");
                    break outer;
                }
                System.out.println("outer");
            }
            System.out.println("Good-Bye");
        }
}
     //  Hello
     //  Hello
     //  Good-Bye


