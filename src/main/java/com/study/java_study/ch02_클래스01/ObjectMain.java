package com.study.java_study.ch02_클래스01;

public class ObjectMain {

    public static void main(String[] args) {
        int a = 10; // 10의 주소 !!

        // 내가 만든 ObjectA 클래스 가져와
        ObjectA objectA1 = new ObjectA(); // 메모리(주소) 할당 ! 새로운 ObjectA() 주소를 objectA1 에 담아라 ex) 주소 100번
        ObjectA objectA2 = new ObjectA(); // 주소 200번

        System.out.println(a);
        System.out.println(objectA1); // objectA1의 주소 나옴
        System.out.println(objectA2); // objectA2의 주소 나옴

        objectA1.num = 20; // objectA1 주소에다가 num 값을 넣음
        objectA2.num = 30; // objectA2 주소에다가 num 값을 넣음

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name); // null 나옴! 메모리 맨 앞자리 즉, 텅 빈 공간


    }

}
