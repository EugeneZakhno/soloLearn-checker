package net.quizful.test18;

import java.util.LinkedHashSet;
import java.util.Set;

public class Question_09 {
}
class HashTest {
    private static Set<String> set = new LinkedHashSet<String>();
    public static void main(String[] args) {
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("/u000a");
        set.add("/u000d");
        set.add("/u000c");
        set.add("1");
        set.add("2");
        set.add("3");
        for (String string : set) {
            System.out.print(string + " ");
        }
    }
}
//Пояснение: LinkedHashSet запоминает порядок вставки элементов. По мере вставки вхождений в таблицу они присоединяются к двунаправленному связному списку.
//Итератор будет перечислять значения в том порядке, в каком они были вставлены.
//LinkedHashSet порядок вставки