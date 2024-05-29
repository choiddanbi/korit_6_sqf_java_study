package com.study.java_study.ch10_추상화01;

public class Dog extends Animal {
    private String breed; // 품종

    // Dog 생성자 생성면 Animal 생성자도 생성 ~
    public Dog() {
        super(); // super(); = 부모객체(=Animal객체) 생성, super = 부모의 주소 >> Animal animal = new Animal(); 인가??
        System.out.println("강아지 객체 생성");
    }

    // 매개변수 생성자 + 부모꺼까지
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println( breed + "종의 강아지가 짖습니다." );
    }


    // Ctrl + O
    @Override
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
