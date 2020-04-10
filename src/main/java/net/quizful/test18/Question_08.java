package net.quizful.test18;

public class Question_08 {
}
 class Abc {
    public static void main(String[] args) {
        p1:
        {
            p2:
            {
                p3:
                {
                    System.out.print("p3.1 ");
                    if (true) break p2;
                    System.out.print("p3.2 ");
                }
                System.out.print("p2 ");
            }
            System.out.print("p1 ");
        }
    }
}

// p3.1 p1

//Пояснение: Идентифицировать можно не только циклы, условия и т.п., а обычный блок кода. Программа сначала выдаст
// строку p3.1, затем выполнится условие - произойдет переход за блок кода с меткой p2 и выдаст p1.