package net.quizful.test18;

import java.util.ArrayList;
import java.util.List;

public class Question_17 {
}
class Aa {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        Integer[] array = null;
        list.toArray(array);
        System.out.println(list.get(1));
    }
}

//Ошибка времени выполнения    Runtime exception
//Пояснение: Для успешного выполнения необходимо, чтобы array содержал ссылку на объект типа Integer[].