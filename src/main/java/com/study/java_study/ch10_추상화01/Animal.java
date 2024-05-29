package com.study.java_study.ch10_추상화01;

// 추상화 : 공통되는 것은 묶어라 ! ex) name 과 age
// Animal 클래스에서 breed 추가하면 Dog, power 추가하면 Tiger !! >> 상속 = 메모리 확장 ( extends 사용 )

public class Animal {
    private String name;
    private int age;

    public Animal() {
        System.out.println("동물 객체 생성");
    }

    // 생성자 !! > 이걸 해줘야 AnimalMain 에서 name, age 포함해 한번에 입력 가능
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드
    public void move() {
        System.out.println("동물이 움직입니다.");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
