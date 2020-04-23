package io.github.myownCheck;

import java.util.ArrayList;

public class FirstProgram {
    public static void main(String[] args) {
        SloganAction firstObject = new SloganAction();
        firstObject.printSlogan();

        Example secondObject = new FlirtAction();
        secondObject.printSlogan();

        FlirtAction thirdObject = new FlirtAction();
        thirdObject.gymLogan();


        SloganAction fourthObject = new FlirtAction();
        fourthObject.printSlogan();
    }
}

interface Example {
     void printSlogan();
}

class SloganAction implements Example {
   public void printSlogan(){
       System.out.println("SloganAction!");
    }
}

class FlirtAction extends SloganAction  implements Example {
    public void printSlogan() {
        System.out.println("FlirtAction!");
    }
    public void gymLogan(){
        System.out.println("GymLogan");
    }
}
