package com.study.java_study.ch03_함수;

public class Function02 {

    // 매개변수 x, 리턴 x
    void fx01() {
        System.out.println("fx01 함수 호출");
    }

    // 매개변수 o, 리턴 x ( main 값을 넘겨줌 )
    void fx02(int num1, int num2) {
        System.out.println("fx02 함수 호출");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    // 매개변수 o, 리턴 o
    String 빙수만들기(String 재료, int count) {
        return 재료 + "빙수: " + count + "개";
    }

        // 매개변수 x, 리턴 o
    String getData() {
        return "데이터";
    }
}
