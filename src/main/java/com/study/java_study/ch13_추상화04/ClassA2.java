package com.study.java_study.ch13_추상화04;

public class ClassA2 extends ClassA {

    // 이걸 해줘야 ClassA(부모클래스) 의 print 메소드 가져다 쓸 수 있음
    // print(자료형 매개변수)
    @Override
    public void print(InterfaceA interfaceA) {
        System.out.println("A2 클래스에서 print 호출");
        interfaceA.test();
    }
}
