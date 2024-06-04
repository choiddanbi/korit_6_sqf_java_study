package com.study.java_study.ch18_빌더;

public class Student {
    private int studentCode;
    private String name;
    private int age;

    // 생성자
    public Student(int studentCode, String name, int age) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }


    // builder 메소드, StudentBuilder 를 리턴받음
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }


    // 내부클래스 : StudentBuilder
    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private int age;


        // build 메소드 생성 > Student() 객체 생성해서 리턴!!
        public Student build() {
            return new Student(studentCode, name, age);
        }

        // 메소드를 setter이용해서 마만들기??
        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this; // 자기자신의 주소를 리턴한다
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}
