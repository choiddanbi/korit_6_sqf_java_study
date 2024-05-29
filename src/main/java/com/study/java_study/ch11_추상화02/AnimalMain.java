package com.study.java_study.ch11_추상화02;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];

        for(int i = 0; i < animals.length; i++) {
            // i 위치가 짝수이면 배열안에 Dog() 넣기 아니면 Tiger() 넣기
            // 이때 Animal에 있는 move클래스 는 의미가 없다
            animals[i] = i % 2 == 0 ? new Dog() : new Tiger();
        }

        // 요게 의미가 없다
        for (Animal animal : animals) {
            animal.move();
        }
    }
}
