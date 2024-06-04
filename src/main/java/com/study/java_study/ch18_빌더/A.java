package com.study.java_study.ch18_빌더;

public class A {

    // 메소드
    public void test() {
        System.out.println("A 클래스 테스트");
    }

    // 내부클래스(일반) : 클래스 안에 클래스..
    public class B {

        // 메소드
        public void print() {
            System.out.println("B 클래스 출력");
        }
    }


    // 내부클래스(static)
    public static class C {
        public void show() {
            System.out.println("C 클래스 조회");
        }

        public static void show2() {
            System.out.println("C 클래스 조회2");
        }
    }
}
