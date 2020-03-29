package com.sololearn;



        interface P {
            void print(int x);
        }
        class Check implements P{
            void print(int x){
                System.out.print(x);
            }
            public static void main(String...arg){
                P ob = new Check();
                ob.print(10);
            }
        }


