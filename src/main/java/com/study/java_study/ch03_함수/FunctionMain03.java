package com.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03(); // Function03.java 가져옴 (fx01,02 꺼내옴)
        fx.fx01(1234, "최단비", 29, "01012345678");

        //        1000       100
        Student student = new Student(); // 객체생성, student 주소는 1000, new Student(); 는 100번 주소,
        // 100번 주소를 외울 수 없어서 student 라는 변수로 100번 주소에 있는 new Student(); 값을 불러옴
        // 즉, 100주소 (new Student();) 에 값이 호출...? ㅠㅠ
        // 100번 주소가 실제 값 = 1000주소에서 값을 꺼내면 100번 주소가 나옴 롸..?
        // 객체에 값을 넣음
        student.studentCode = 5678;
        student.name = "박도현";
        student.age = 1;
        student.phone = "01077777777";

        fx.fx02(student);
    }
}
