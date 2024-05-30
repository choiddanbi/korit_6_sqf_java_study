package com.study.java_study.ch12_추상화03;

public class ConstantMain {
    public static void main(String[] args) {
        // 변수 a > 변수 안에 들어있는 주소값을 바꿔줌 ( 10주소에서 20주소로 )
        // 상수 b > final

        /*
            상수 특징
            1. 선언과 초기화를 잘 구분해야한다.
            2. 선언 이후에 한번이라도 초기화가 되면 ( 최초대입 ), 그 다음부터는 다른 값으로 변경 할 수 없다 !!
            3. 상수는 가능한 대문자로 표기한다.
            4. 모든 상수명이 대문자이기 때문에 스네이크 표기법을 사용한다 (단어간의 구분을 위해)
         */
        int a = 10;
        a = 20;
        final int C = 30; // final 을 추가하면 상수됨 , 이게 선언과 초기화 ( 최초대입 )
        // C = 40; // 이건 안됨. C가 상수니까
        final int B;
        B = 30;
        // B = 40; // 은 안됨
    }

}
