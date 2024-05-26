package com.study.java_study.ch04_제어;

public class Star { // 5줄 이면 *은 최대 5개
    public static void main(String[] args) {

        /* 1번
            *
           **
          ***
         ****
        *****
        */

        for(int i = 0; i < 5; i++) { // 5줄, 6줄짜리는 i<6이랑 ""의 j < 6 - 1 - i
            for (int j = 0; j < 5 - 1 - i; j++) { // 5-i하면 마지막줄 맨 앞에 공백 하나 등어감
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /* 2번
        *****
         ****
          ***
           **
            *
          */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /* 3번
            * // 공백4
           *** // 공백3
          ***** // 공백2
         ******* // 공백1
        ********* // 공백0
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
