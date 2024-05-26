package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {

    public static void main(String[] args) {
        // [ 일반 자료형 ]
        // 1. 논리
        boolean a = false;
        boolean b = true;

        // 2. 숫자 (정수)
        int c = 1000;
        long d = 10000000000l;

        // 3. 숫자 (실수)
        double e = 3.14;

        // 4. 문자_한 글자만''
        char f = '가'; // AC00

        // 5. 문자열_두 글자 이상""
        String g = "가나";

        System.out.println((char)((int)f + 1)); // 형변환

        // 형변환 문자 < 정수 ( int ) < 실수 ( double )
        double num = 3.14;
        System.out.println(num);
        int num2 = (int)num; // 명시적 형변환 (?), 다운캐스팅
        System.out.println(num2);
        double num3 = num2; //업캐스팅
        System.out.println(num3); // 묵시적 형변환...?

    }
}
