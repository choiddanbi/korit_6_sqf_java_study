package com.study.java_study.ch19_익명클래스;

public class KeyMain {
    public static void main(String[] args) {

        Key attackKey = new AttackKey();
        attackKey.onKeyUP();
        attackKey.onKeyDown();

        // 익명클래스 - Key 인터페이스를 implements 해서 쓰겠따!! - Ctrl + I
        Key customKey = new Key() {
            @Override
            public void onKeyUP() {
                System.out.println("커스텀키 뗌");
            }

            @Override
            public void onKeyDown() {
                System.out.println("커스텀키 누름");
            }
        };

        customKey.onKeyDown();
        customKey.onKeyUP();

    }
}
