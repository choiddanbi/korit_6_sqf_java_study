package com.study.java_study.ch11_추상화02;

public class Dog extends Animal {

    //public abstract class Dog extends Animal { >> 이걸로 되어야함
    // 아래의 코드가 없다면 Dog 도 추상클래스로 해줘야함
    // 단, 구현을 하면 Dog 는 굳이 추상클래스로 안해줘도 됨
    // 만약 Dog 가 추상클래스가 된다면, Dog 라는 클래스는 객체생성 못함!! > 추상클래스가 되어버리니ㄱ까

    @Override // 도그가 무브를 오버라이드
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }
}
