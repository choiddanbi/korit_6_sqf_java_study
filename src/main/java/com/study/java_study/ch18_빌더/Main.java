package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        // 일반 내부클래스
        A a = new A();
        // B b = new B(); > 를 못함 ! 클래스 안에 클래스니까
        A.B b = a.new B(); // a.new B() 는 A클래스 안에 들어있는 B생성자 호출!!, A.B 는

        a.test();
        b.print();

        // static 내부클래스 + 일반메소드
        // A a = new A(); 없이 바로 가능 > C 클래스가 static 이니까
        A.C c = new A.C(); // new A.C() 는 A안에 들어있는 C생성자
        c.show(); // show 는 static이 아니라서 new A.C(); 해줘야함

        // static show인 경우 > static메소드
        A.C.show2();
    }
}
