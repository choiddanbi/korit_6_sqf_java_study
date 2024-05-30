package com.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    // Alt + Insert
    // 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter/ Setter 들어와야함 > 복잡해서 생략했음

    // 만약 String[] student = new String[3]; 이거이면
    // String 자료형을 쓰는거고 String자료형은 컴퓨터에 String 클래스로 이미 정의되어있음

    // student 는 자료형이 Student 인데 Student 자료형은 내가 만든 자료형이다 > 그래서 최상위인 Object 클래스 를 씀!
    // Object 에 있는 equals 는 원래 주소비교인데 값비교로 재정의 해줄거임
    // Student s = new student()랑 Student s2 = new student() 에서
    // s 와 s2 안의 값이 같다면 true 로 나오게 재정의 해줄거임
    // equals 는 원래 주소 비교임 ?? 아닌데...?
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) { // obj와 매개변수의 클래스가 동일한 클래스인지 확인
            Student student = (Student) obj; // 다운캐스팅 > student 가 obj 로 업캐스팅 해서 들어온거니까 > 모든것들은 obj로 업캐스팅 된거..?
            return Objects.equals(student.name, name) && Objects.equals(student.age, age); // _s 가 붙으면 utils 이다 ! ( obj name, private 변수 name )
        }
        return false;
    }


    // hashCode 는 원래 주소비교!
    // s1 과 s2 주소는 다른건데
    // s1과 s2 주소가 true 가 나왔으면 좋겠어 그래서 재정의
    // 다른 객체, 다른 패키지여도 값만 같으면 주소는 같다 = hashCode
    // 다른 패키지이면 값이 같아도 주소 다르다 = equals...
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Alt + Insert
    // Object 클래스의 메소드르 ㄹ재정으한거
    // 문자열을 리턴해주는 용도
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
