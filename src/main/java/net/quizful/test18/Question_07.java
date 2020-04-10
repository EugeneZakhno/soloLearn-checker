package net.quizful.test18;

public class Question_07 {
}
class TypesTutorial {
    public static void main(String... args) {
        A alpha = new B(0);
    }
}

class A {
    A(int x){            // - 1 -
        a(x);            // - 2 -
    }

    public A() {   // В условии этого конструктора нет

    }

    void a(int x) {
        System.out.println("A-a: " + x);
    }
}

class B extends A {

    B(int x) {
                             // - 3 - Пояснение: В классе A отсутствует конструктор по-умолчанию, поэтому конструктор
                               // класса B (потомок) первым делом должен явно вызвать один из обьявленных конструкторов
                              //  класса-родителя.
        a(x);            // - 4 -
    }

    void a(int x) {
        System.out.println("B-a: " + x);
    }
}