package net.quizful.test01;

public class Question_07 {
   public static  void  main (String[] str){
       String A = "Test2";
       A += "55";
       System.out.println(A);

     //  String A = "Test1";
     //   A -= "23";

     //  Integer int2 = new Integer (15);
     //  int2;

       Integer int1 = new Integer (41);
       int1 -= 33;
       System.out.println(int1);

       // Пояснение: В отличие от C/C++, в Java в качестве операторов может использоваться
       // ограниченное количество арифметических выражений: присваивание, инкремент/декремент (++/--),
       // вызов метода, создание объекта. Всё остальное недопустимо.
       // Например, "Math.abs(1);" - корректно, а "Math.abs(1) + Math.abs(2);" - уже ошибка.
   }



}
