package com.study.java_study.ch13_추상화04;

// 인터페이스와 클래스니까 implements
public class InterfaceA1 implements InterfaceA {

    // 추상메소드를 가지고있으니까
    // 오버라이드로 내가 재정의해서 새롭게 쓰겠따
    @Override
    public void test() {
        System.out.println("InterfaceA1에서 테스트 실행");
    }
}
