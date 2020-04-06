package net.quizful.test01;

public class Question_01 {

        // I figured it out! — Я все понял!
        public static void main(String[] args) {
            System.out.println("4/2=" + 4/2 == "4/2=2"); // always true
        }

/*    true // Correct
      false
      4/2=true
      4/2=false


    Пояснение:
    Деление: 4/2 → 2
    Приведение типов: 2 → "2"
    Конкатенация: "4/2=" + "2" → "4/2=2"
    Сравнение: "4/2=2" == "4/2=2" → true
    Всё это происходит (cо стороками) на этапе компиляции - в скомпилированном байт-коде строк нет.
    */
}
