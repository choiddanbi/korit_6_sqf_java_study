package com.study.java_study.ch14_Object;

/*
    Object 클래스(최상위 클래스)

 */

import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object(); // object 객체 생성 ! Object 라는 클래스는 원래 정의되어 있는거임 > 그 안에는 여러 메소드들이 있음!! > 기본으로
        Student student = new Student("최단비", 29);
        Student student2 = new Student("최단비", 29);
        // student 에 Object들에 있는 메소드들이 있음 (난 만든적이 없는데..)
        // -> Object 클래스를 상속하고 있다는 뜻 난 한적이 없는데...? > 자동임
        // 다른 클래스를 상속 안하면 Object부터 타고 내려옴
        // 다른 클래스를 상속하면 ..?
        Object[] objects = new Object[3]; //objects 라는 배열 생성
        objects[0] = new Object(); // Object 배열 자료형도 가능
        objects[1] = "test"; //String 자료형도 가능
        objects[2] = new Student("최단비", 29); // Student 자료형도 가능
        // Object 가 최상위니까 모든 자료형들은 업클래스해서 사용 가능하다 > 모든 데이티ㅓ들을 다 받을 때 사용

        /* Object 의 주요메소드들
         getClass() : 객체 자료형 비교할 ㄸㅐ 사용
         hashCode() : 객체의 주소
         equals() : 값 비교
         clone() : 객체 복제
         toString() : 값을 출력
         */

        // toString
        System.out.println(student.toString()); // .toString 생략 가능 >> (student)
        String str = "데이터"; // = String str = new String("데이터");
        System.out.println(str); // = System.out.println(str.toString);

        // String studentData = student; > 이건 안됨 student 변수는 String타입ㄴ이 아니니까 > student 자료형은 Student > 주소값!
        String studentData = student.toString(); // 이건 됨

        System.out.println(student.equals(student2)); // true > equals 는 원래 주소비교인데 값비교로 재정의 해준거!!!!!

        System.out.println(student.hashCode()); // student 주소
        System.out.println(student2.hashCode()); // student2 주소

        System.out.println(student.hashCode() == student2.hashCode()); // 원래느 ㄴ서로 다름 근데 hashCode 재정의 해줘서 true 나옴
        System.out.println(Objects.hash("최단비"));
        System.out.println(Objects.hash("최단비"));


    }
}
