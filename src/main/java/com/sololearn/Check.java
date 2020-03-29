package com.sololearn;


//https://photos.app.goo.gl/jTmfqqJF8frXt2TZ7
        interface P {
            void print(int x);
        }
        class Check implements P{
             void print(int x){  // print needs to be public
                System.out.print(x);
            }
            public static void main(String...arg){
                P ob = new Check();
                ob.print(10);
            }
        }


