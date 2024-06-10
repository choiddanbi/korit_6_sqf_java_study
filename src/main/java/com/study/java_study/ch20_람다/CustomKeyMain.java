package com.study.java_study.ch20_람다;

public class CustomKeyMain {
    public static void main(String[] args) {
        // 익명클래스
        CustomKey attackKey = new CustomKey() {
            @Override
            public void onKeyPress() {
                System.out.println("공격키 누름");
            }
        };

        attackKey.onKeyPress();

        // 익명클래스를 람다로 표현
        CustomKey skillKey = () -> {
            System.out.println("공격키 누름");
        };

        skillKey.onKeyPress();

    }
}
