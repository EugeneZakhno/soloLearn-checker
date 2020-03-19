package com.sololearn;
//What is the output of this code?
// https://photos.app.goo.gl/UycnCS4Pi8nKG68XA
import java.util.*;
public class Output {

    public static double sumOfList(List<?extends Number> list){
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return 3;
    }

    public static void main(String args[]) {
        List <Integer> item = Arrays.asList(1, 2);
        System.out.print(sumOfList(item));
    }
}