package com.study.java_study.ch07_클래스02;

public class StudyB {

    // name, age 변수
    private String name; // private 접근제한자 >> Main 클래스에서 name 호출 못함 (= 내 클래스에서만 쓰겠따!!! )
    private int age;

    public StudyB() {} // 기본생성자 ( 원래는 자동으로 숨겨서 적혀있는데 오버로딩 하면 다시 적어줘야행 )


    // private 변수들한테 값을 넣어주기 위해서 > 외부에서 쓰려고
    // 생성자는 public 이기 떄문에 가능
    // default StudyB 하면 내 패키지에서만 가능!!

    // StudyB 생성자 오버로딩 !!!
    public StudyB (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter / setter : 정해진 절차대로 데이터 주고받기 위해 사용
    // 값 좀 넣어줘 : 변수를 private 으로 선언해줘서 다른 클래스에서 못쓰니까 ..?
    // Alt + Insert
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

    // show 라는 생성자
    public void show() {
        System.out.println(name);
        System.out.println(age);
    }
}


