package com.sololearn;

public class MainClose {
    public static void main(String[] args) {
        G obj = new G();
        System.out.print(obj.x);
        obj.close();
    }
}

class G {
    public int x = 2;
    G() {
        x++;
    }
    public void close() {
        x++;
    }
}
