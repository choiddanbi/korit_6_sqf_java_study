package com.study.java_study.ch04_제어;

// 반복문 For_순서대로 일정하게 반복, 순서대로 증가..? // while_순서없는 조건에 따른 반복
public class For01 {

    public static void main(String[] args) {
        /* 1 ~ 10000까지
        for (int i = 0; i < 10000; i++) { // int i = 0; -> i < 10000; -> sout -> i++ -> i < 10000; -> sout -> i++ ... 순서
            System.out.println(i + 1); // 1 ~ 10000 까지 출력해야 하니까 i + 1
        } */

        // 10000 ~ 1까지
        for (int i = 0; i < 10000; i++) {
            System.out.println(10000 - i);
        }
    }
}
