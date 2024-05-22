package com.study.java_study.ch02_클래스01;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student(); // 학생 객체 생성, 주소할당
        Student student2 = new Student();

        student1.name = "손경태"; // student1 주소에 name 과 age 주소가 존재
        student1.age = 29;
        student2.name = "신선애";
        student2.age = 25;
    }
}
