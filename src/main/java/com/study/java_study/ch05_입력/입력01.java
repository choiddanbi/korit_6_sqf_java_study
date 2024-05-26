package com.study.java_study.ch05_입력;

import java.util.Scanner; // Alt + Enter

public class 입력01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 키보드로.... 입력받으려고 쓰는 애, 스캐너 객체 생성 !! 스캐너는 이미 정의된 함수고 내가 가져다 쓰는거임
        System.out.print("a: ");
        // scanner.next(); // String 값으로.. scanner 함수에서 next라는 걸 씀 > 콘솔에서 입력 받는 애
        /*
          next() 메소드 특징
            1. 공백과 줄바꿈(엔터)는 무시한다.
            2. 버퍼를 사용한다.
               - 버퍼에 키보드 입력값을 하나씩 담아서 엔터or스페이스바를 누르면 그 버퍼를 한쌍으로 봄
               - (입력된 값들을 하나로 묶어서 한 문장으로 안정적으로 쓰려고)
               - 엔터 : 버퍼의 끝 / 스페이스바 : 한 버퍼 => 그래서 10 20 을 치면 이상하게 들어감
               - nextLine 을 쓰는거야 // (?) 못들었따ㅠㅠ 엔터 스페이스 같이 꺼낸다그랬던가..

         */
        String a = scanner.next(); // 입력 받은 값을 출력해주려고 String a = 어쩌구 를 해줌..

        System.out.println("에이: " + a);
        System.out.print("b: ");
        String b = scanner.nextLine();
        System.out.println("비: " + b);

    }
}
