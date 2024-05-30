package com.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성할 수 없다.
 */

public class StudentMain {
    public static void main(String[] args) {
        // StudentService studentService = new StudentService();
        // StudentService studentService2 = new StudentService();
        // 원래 이렇게 생성해줬는데 이러면 안됨 > StudentService 생성자를 private 걸었기 때문 > 싱글톤
        StudentService studentService = StudentService.getInstance(); // 로 생성해줘야함, getInstance() static 객체 생성 > 클래스명.메소드();
        StudentService studentService2 = StudentService.getInstance(); // 로 생성해줘야함, getInstance()객체
        // studentService 과 studentService2 느 ㄴ주소까지 아예 동일



        /* 아래와 동일 // 싱글톤일땐 작동 안함
       StudentRepository studentRepository = new StudentRepository();
       studentRepository.add("최단비2");
       StudentRepository.getInstance() = 객체 기능
       */
        studentService.addStudent(); // 싱글톤이라서 이렇게 씀
        StudentRepository.getInstance().add("최단비2"); // 원래라면 StudentRe~ studentRe~ = new Su~ > student~.add("최단비2"); > 로 해야함
        // StudentRepository.getInstance(). 하나의 객체다 = 주소임 // isatance.add
        studentService2.addStudent();


        studentService.getStudentData();

    }
}
