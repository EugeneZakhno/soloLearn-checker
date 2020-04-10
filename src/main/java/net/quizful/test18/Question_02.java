package net.quizful.test18;

public class Question_02 {

}
 class Foo {
    private Foo() {
     //   return this;  // 1 Возникнет ошибка компиляции в строке 1 - в конструкторе в операторе return не допускается указывать возвращаемое значение.
    }
    public static Foo get() {
        return new Foo();       // 2
    }
    public static void main(String[] args) {
        Foo foo1 = get();       // 3
        Foo foo2 = new Foo();   // 4
    }
}
