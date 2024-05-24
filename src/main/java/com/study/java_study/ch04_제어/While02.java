package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("갯수: ");
        int count = scanner.nextInt();

        // 순서의 증가니까 for 문으로 작성하는게 더 좋음
        /* while 문 사용
        int i = 0;
        while(i < count) {
            if(i % 2 == 0) {
                System.out.println("짝수입니다.");
                i++;
                continue; // 지금까지 반복문 내용만 하고 다음 반복으로 넘어가라
            }
            System.out.println("홀수입니다.");
            i++;
        }*/

        // for문 사용
        for (int j=0; j<count; j++) {
            if(j % 2 == 0) {
                System.out.println("짝수입니다.");
                continue;
            }
            System.out.println("홀수입니다.");
            }

        }
    }

