package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// 람다 인터페이스 종류들
public class LambdaInterface {
    public static void main(String[] args) {
        // 1. Runnable 인터페이스의 run 추상메소드
        // 리턴 X, 매개변수 X
       /*
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            }
        };*/

        // 람다식으로 표현 + 오버라이딩
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        runnable.run();


        // 2. Function 인터페이스의 apply 추상메소드
        // String 매개변수, Integer 리턴
        // 매개변수 O, 리턴 O
       /* Function<String, Integer> fx = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }*/

        // 람다식으로 표현 + 오버라이딩
        Function<String, Integer> fx = s -> Integer.parseInt(s); // 문자열을 정수로 변환해라

        Integer num = fx.apply("10");
        System.out.println("num : " + num);

        // andThen : default 메소드 > apply 이후에 쓰는애임 ( apply 이후에 apply 값으로 result 가 생성된다구.....? ㅠㅠ )
        Integer num2 = fx.andThen(result -> result + 100).apply("10"); // 롸...??
        System.out.println("num2 : " + num2);


        // 3. Consumer 인터페이스의 accept 추상메소드
        // 매개변수 O, 리턴 X
        /*Consumer<String> transform = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "서버에 접속하였습니다.");
                System.out.println(s + "님 환영합니다.");
            }
        };*/


        // 람다식으로 표현
        Consumer<String> transform = s -> {
            System.out.println(s + " 서버에 접속하였습니다.");
            System.out.println(s + "님 환영합니다.");
        };

        transform.accept("김준일");


        // 4. Supplier 인터페이스의 get 추상메소드
        // 매개변수 X, 리턴 O
        Supplier<Integer> role = () -> {
            Integer result = num + 999; // 메소드안에서 메소드를 정의중이다 -> 변수들을 ( num, num2 등.. ) 지역변수로 사용중이니까 위에 변수들 다 가져다 쓸 수 있따
            return result;
        };

        System.out.println(role.get());


        // 5. Predicate 인터페이스의 test 메소드
        // 매개변수 O, 리턴 O
        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10));

    }
}
