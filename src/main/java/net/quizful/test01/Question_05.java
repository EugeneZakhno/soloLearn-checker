package net.quizful.test01;

public class Question_05 {

        public static void main(String args[]) {
            label:
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 5; ++j) {
                    if (i > 2) break label;
                    System.out.print(j);
                }
                System.out.print(" ");
            }
        }
    }

     // 01234 01234 01234
//Пояснение:
// Оператор break с меткой позволяет обойти идентифицируемый блок кода.
// Программа выдаст строку 01234 01234 01234, а затем выйдет из всех циклов и продолжит выполнение.