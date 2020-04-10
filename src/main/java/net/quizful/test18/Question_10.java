package net.quizful.test18;

public class Question_10 {

}
class Quest {
    public static void main() {
        System.out.print("А");
    }
    public static void main(String args) {
        System.out.print("Б");
    }
    public static void main(String[] args) {
        System.out.print("В");
    }
}

// B
//Пояснение: Методы main() являются корректно перегруженными, поэтому никаких ошибок не произойдет, а будет вызван только метод, запускающий приложение.