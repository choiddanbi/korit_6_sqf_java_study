package com.study.java_study.ch04_제어;

import java.rmi.MarshalException;
import java.util.Random;
import java.util.Scanner;

// 0 ~ 4 랜덤 숫자 맞추기
public class While01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int num = random.nextInt(4); // 0 ~ 4까지 중 랜덤

        while(true) {
            System.out.println("입력: ");
            int data = scanner.nextInt();
            if(num == data) { // ==는 주소비교라면서요ㅠㅠ......
                System.out.println("정답은 " + data + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요.");

        }

    }
}
