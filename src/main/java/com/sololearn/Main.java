package com.sololearn;

public class Main {
    public static void main(String[] args) {

      //  What is the output of this code ?
                String y = "12333dfghj@gmail.com";
        if (y.substring(y.length() - 5).equals(".com")) //always false
            System.out.print(y.substring(1));
        else
            System.out.print(y.length());
    }
    //Output 20
}
