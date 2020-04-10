package com.sololearn;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Questions_02 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 4;
        int y = 0;
        for (int i = 0; i < 5; i++)
            y += arr[x - i] * i;
        System.out.println(y);
    }


}
