package net.quizful.test18;

public class Question_16 {
}
 class Tests {
        public static void main(String[] args) {
            String s = new String("ssssss");
            StringBuffer sb = new StringBuffer("bbbbbb");
            s.concat("-aaa");
            sb.append("-aaa");
            System.out.println(s);
            System.out.println(sb);
        }
    }
    //Пояснение: s.concat() не изменит значения s, так как String это "immutable"(неизменяемый) объект,
//   в отличии от StringBuffer, который реализует изменяемые строки

