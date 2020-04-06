package net.quizful.test01;
import java.text.NumberFormat;
public class Question_04 {


        public static void main(String[] args) {
            float f = 123.45678f;
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(f));
        }

/*      Ошибка времени выполнения
        Программа выведет "123.45"
        Программа выведет "123.46"  // Correct
        Ошибка компиляции
    */
}
