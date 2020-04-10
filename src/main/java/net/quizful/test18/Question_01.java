package net.quizful.test18;

public class Question_01 {
    public static void main(String[] args) {
        Double d1 = 1d;
        Double d2 = 1d;
        System.out.println(d1 == d2);
    }
}

// output: false

// Пояснение:
      /*
      В данном примере происходит сравнение объектов с помощью ==, т.е. сравниваются ссылки на объекты, а не их содержимое.
      Разные объекты - различные ссылки, поэтому и результат false.
      А вот если бы объекты сравнивались, как и положено, с помощью equals() - то получилось бы true.



            Пул есть только для Boolean, Byte, Char, Short, Integer, Long
        */
