package com.study.java_study.ch08_클래스03;

public class Student {
    // 변수는 private 로 ~ + getter / setter 생성
    private int code;
    private String name;
    private int age;

    // 기본생성자
    public Student() {

    }


    // 생성자 오버로딩1
    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }



    // 생성자 오버로딩2 ( Construct > 입력 받고 싶은 거에 따라 다르게 )
    public Student(int code, String name, int age) {
        this.code = code; // 위에 변수 code 에 매개변수 code 를 넣겠따
        this.name = name;
        this.age = age;
    }


    // GETTER 와 SETTER 생성
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
