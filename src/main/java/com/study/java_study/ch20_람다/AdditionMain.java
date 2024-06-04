package com.study.java_study.ch20_람다;

public class AdditionMain {
    public static void main(String[] args) {
        // 람다식 아닐 경우
        Addition addition = new Addition() { // 익명클래스 :
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result = addition.add(10, 20);
        System.out.println("결과 1: " + result);


        // 람다식으로 표현 = 익명클래스의 정의, 생성을 간단하게 변경해줌 !!!
        Addition addition2 = (x, y) -> x + y;
        result = addition2.add(10, 20);
        System.out.println("결과 2: " + result);
    }
}
