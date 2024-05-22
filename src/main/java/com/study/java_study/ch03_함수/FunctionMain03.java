package com.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03(); // Function03.java 가져옴 (fx01,02 꺼내옴)
        fx.fx01(1234, "최단비", 29, "01012345678");

        Student student = new Student(); // 객체생성
        // 객체에 값을 넣음
        student.studentCode = 5678;
        student.name = "박도현";
        student.age = 1;
        student.phone = "01077777777";

        fx.fx02(student);
    }
}
