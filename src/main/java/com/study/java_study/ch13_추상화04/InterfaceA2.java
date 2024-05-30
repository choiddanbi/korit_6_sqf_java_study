package com.study.java_study.ch13_추상화04;

// 인터페이스와 클래스니까 implements
public class InterfaceA2 implements InterfaceA {

    // 추상메소드를 가지고있으니까
    @Override
    public void test() {
        System.out.println("InterfaceA2에서 테스트 실행");
    }
}
