package com.study.java_study.ch03_함수;

public class Function03 {

    // 자료형을 매개변수로 할 경우
    void fx01(int studentCode, String name, int age, String phone) {
        System.out.println("fx01 함수 호출");
        System.out.println(studentCode);
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println();
    }

    // 객체를 매개변수로 할 경우
    void fx02(Student student) { // 학생객체의 주소를 넣어줌 매개변수가 객체이다(student)
        System.out.println("fx02 함수 호출");
        System.out.println(student.studentCode);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.phone);
    }
}
