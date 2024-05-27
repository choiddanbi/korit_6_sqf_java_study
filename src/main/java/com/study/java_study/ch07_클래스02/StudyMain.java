package com.study.java_study.ch07_클래스02;

import com.study.java_study.ch07_클래스02.접근지정자.AccessMain;

public class StudyMain {

    public static void main(String[] args) {
        // 스터디 에이 객체 생성
        /*
        StudyA a = new StudyA(); // 생성자 호출 , 메서드 호출과 유사, 즉 StudyA()의 주소가 a에 들어감 !!!!!
        System.out.println(a.num);
        System.out.println(a.num2);
        a.num = 100;
        a.num2 = 1000;
         */

        StudyA a = new StudyA();
        System.out.println(a.num);
        System.out.println(a.num2);

        // StudyB b = new StudyB();


        // 이거도 가능 ! >> 스터디 에이 객체 생성 100 1000
        // StudyA a = new StudyA(100, 1000);
        // System.out.println(a.num);
        //System.out.println(a.num2);

        // b.age = 29;
        // StudyB b = new StudyB();


    }
}
