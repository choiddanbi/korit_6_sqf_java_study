package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {
        // 1. Runnable 인터페이스의 run 추상메소드
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
        };

        runnable.run();

        // 2. Function 인터페이스의 apply 추상메소드
        Function<String, Integer> fx = s -> Integer.parseInt(s);
        Integer num = fx.apply("10");
        System.out.println("num : " + num);


        // 3. Consumer 인터페이스의 accept 추상메소드
        Consumer<String> consumer = s -> {
            System.out.println(s + " 님이 접속하였습니다.");
        };
        consumer.accept("최단비");


        // 4. Supplier 인터페이스의 get 추상메소드
        Supplier<Integer> s = () -> 999;

        // 5. Predicate 인터페이스의 test 추상메소드

    }
}

