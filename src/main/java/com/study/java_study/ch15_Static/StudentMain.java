package com.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴 >> static 이용!!
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성할 수 없다.
      싱글톤 필수 조건 ==> 자신을 담을 인스턴스변수, 외부에서 호출 못하게 생성자 private로, getinstace라는 static 메소드 생성
 */

public class StudentMain {
    public static void main(String[] args) {
        // StudentService studentService = new StudentService();
        // StudentService studentService2 = new StudentService();
        // 원래 이렇게 생성해줬는데 이러면 안됨 > StudentService 생성자를 private 걸었기 때문 > 싱글톤
        StudentService studentService = StudentService.getInstance(); // 클래스명.메소드(); > static
        StudentService studentService2 = StudentService.getInstance();
        // studentService 과 studentService2 는 주소까지 아예 동일 = 객체 생성 없이 했으니까
        // StudentRepository 에다가 주소 하나 만들어놓구 가져다 쓰는거니까


        /* 아래와 동일 // 싱글톤일땐 작동 안함
       StudentRepository studentRepository = new StudentRepository();
       studentRepository.add("최단비2");
       StudentRepository.getInstance() = 객체 기능
       */
        studentService.addStudent(); // 싱글톤이라서 이렇게 씀 > static 변수라서 !!
        StudentRepository.getInstance().add("최단비2");
        // StudentRepository.getInstance(). 하나의 객체다 = 주소임 // isatance.add
        studentService2.addStudent();


        studentService.getStudentData();
    }
}
