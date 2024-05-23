package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    // 오버로딩 : 한 클래스안에 동일한 이름의 함수가 존재할 수 없음 근데 쓰고싶을때.. 매개변수를 다르게 함!!!
    // 동일한 함수명의 함수를 호출할 때 어떠한 함수를 호출할지 매개변수로 정해짐
    // 매개변수의 갯수 or 매개변수의 자료형이 다르거나 해야함 !!
    // 자료형도 조심해야함(??)
    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b+ c);
    }


}
