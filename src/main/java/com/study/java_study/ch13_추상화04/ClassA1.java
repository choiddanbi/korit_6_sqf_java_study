package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA {

    // 부모꺼를 재정의하겠따
    // print 메소드가 interfaceA 매개변수를 의존한다! > interfaceA 가 있어야 실행도ㅣ니까 > 의존객체를 외부에서 주입한다 ! defendency
    @Override
    public void print(InterfaceA interfaceA) { // print는 외부에서 객체가 주입되고, 그 객체가 뭐냐에 따라 결과가 달라짐 > 의존성?
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test();

    }
}
