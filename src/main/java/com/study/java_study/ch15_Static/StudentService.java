package com.study.java_study.ch15_Static;

public class StudentService {
    // 변수 static
    private static StudentService instance;

    // private 생성자
    private StudentService() {}


    // 메소드 getInstance()
    // 싱글톤하기 위한 메소드!!
    // 매개변수를 쓰지 않아도 다같이 공유 가능
    public static StudentService getInstance() {
        if(instance == null) {
            instance = new StudentService(); // 새로운 객체 생성
        }
        return instance; // instance = 객체 만 return하기 때문에 여기서 만들어진 변수들의 주소는 전부 동일하다
    }

    // 메소드
    public void addStudent() {
        /* StudentRepository studentRepository = new StudentRepository();
        studentRepository.add("최단비");*/
        StudentRepository.getInstance().add("최단비"); // 주소
        // StudentRepository.getInstance() => private static StudentService instance 의 주소
    }

    // 일반메소드
    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

}
