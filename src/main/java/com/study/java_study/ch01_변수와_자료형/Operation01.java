package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2; // 4
        System.out.println(num2);
        int num3 = 9 % 2; // 1
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0 ; // 2의 배수인가 아닌가 or 짝수냐 아니냐

        System.out.println("//////////////////////////");

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i); // 선증가
        System.out.println(i++); // 후증가 일단 지금은 쓰고 다음번째에 +해라................
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);


        // 논리연산자
        // true => 1
        // false => 0
        // && => AND (곱)
        // || => OR (합)
        // ! => NOT (부정)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(true || true); // true
        System.out.println(false || false); // false
        System.out.println(!(true && true)); // false

        // 관계연산자
        System.out.println(3 > 2 && 1 == 1); // true
        System.out.println(1 != 1); // false

        // 조건연산자 --> 조건식 ? 참일때 : 거짓일때
        System.out.println(3 > 2 ? 10 : 20);
        int x = 10;
        int y =2;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다.";
        String result2 = "" + 10 / 2;

        // 복합대입연산자 : 나 자신한테 연산한 값을 넣겠따..
        int number = 10;
        number += 5; // number = number + 5;
        number -= 1; // number = number - 1;
        number *= 2; // number = number*2;
        number /= 2; // number = number/2;
        number %= 2; // number = number%2;


    }
}
