package com.study.java_study.ch04_제어;

public class Gugudan {
    public static void main(String[] args) {
        /*
        [2단]
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18

        [9단]
        ...
         */

        for ( int i = 0; i < 8; i++ ) {
            int dan = i + 2;
            System.out.println("[" + dan + "단]");
            for ( int j = 0 ; j < 9; j++ ) {
                int num = j + 1;
                System.out.println( dan + "X" + num + "= " + dan*num);
            }
        }
    }
}
