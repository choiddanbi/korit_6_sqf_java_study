package com.study.java_study.ch18_빌더;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// stream 예제
public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,7,8,9,10);
        List<Integer> numbers2 = new ArrayList<>();

        // number 값에 2 곱해서 number2로
        for (Integer n : numbers) {
            numbers2.add(n * 2);
        }

        // 위에랑 같은거!! > 빌드패턴 사용
        List<Integer> numbers3 = numbers.stream().map(n -> n * 2).collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(numbers2);
        System.out.println(numbers3);
    }
}
