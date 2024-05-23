package com.study.java_study.ch03_함수;

public class FunctionMain04 {
    public static void main(String[] args) {

        Function04 function04 = new Function04();

        function04.add(10, 20);
        function04.add(10, "20"); // 만약 정수대신에 문자열이 오구싶음. 결과는 1020이 아닌 30 이고 싶을때.. void add(int a, String b)

    }
}
