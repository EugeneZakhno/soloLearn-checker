package net.quizful.test18;

public class Question_11 {
}
class Performer {
    public static void main(String[] args) {
        if (args instanceof Object) { // 1
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
// yes
//Пояснение: Напечатает yes, так как массив это тоже обьект