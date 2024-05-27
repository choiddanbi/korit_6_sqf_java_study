package com.study.java_study.ch08_클래스03;

public class StudentMain {

    // 포인트 !!! 객체를 배열로 만들 수 있따는 것을 알아야함
    public static void main(String[] args) {
        int[] numbers = new int[5]; // 값은 0인게 5개
        // Student[] students = new Student[5]; // 값은 null 인 게 5개

        numbers[0] = 10; // int num = 10; 예제

        /*
        객체 생성
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

         랑 아래는 같다고 봐줌
         ( 변수일때 배열일때 차이 )

        배열 생성 = 객체인 배열 생성 예제
        Student[] students = new Student[3];
        students[0] = new Student(1, "김준일", 31);
        students[1] = new Student(2, "김준이", 32);
        students[2] = new Student(3, "김준삼", 33);
        */


        Student[] students = new Student[5]; // student 배열(객체) 생성 ( = Student 클래스를 가져다 쓰겠따? )
        // Student[] students = new Student();
        students[0] = new Student(); // student 자료를 담을 수 있는 배열 공간'만' 생성
        students[1] = new Student(123456, "최단비", 28); // 값을 담음, 생성자
        students[2] = new Student(111111, "박도현", 1);
        // Students student = new Student(); 예제

        /* String name = students[1].getName(); // name 변수에 담기
        System.out.println(students[1].getName());
        System.out.println(students[1].getAge());*/

        for (int i=0; i< students.length; i++) {
            if(students[i] == null) {
                continue;
            }
            System.out.println("학번 : " + students[i].getCode());
            System.out.println("이름 : " + students[i].getName());
            System.out.println("나이 : " + students[i].getAge());
            System.out.println();
        }
    }
}
