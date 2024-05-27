package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 라는 클래스를 가져다 씀

        // nextline은 스페이스,엔터 무시
        // next 는 스페이스,엔터 인식
        String name = null; // next()
        int age = 0; // nextInt()
        String address = null; // nextLine()
        String gender = null; // next()
        String phone = null; //nextLine()


        // 단비 (엔터) 29 (엔터) 경기도 (스페이스) 평택시 (엔터)
        System.out.print("이름: ");
        name = scanner.next(); // 위에 선언해줘서 String name = 어쩌구로 안해주고 바로 name = 해줌
        System.out.print("나이: ");
        age = scanner.nextInt();
        System.out.print("주소: ");
        scanner.nextLine(); // nextLine 이니까 엔터를 인식하기 때문에 이거를 적어주는거야 = 버퍼를 지워준다 ( 공백/엔터/스페이스 를 지워준다 )
        address = scanner.nextLine(); // nextLine 이전에 nextLine을 제외한 다른 next 들이 오면 버퍼를 한번 지워줘야한다 !!
        System.out.print("성별: ");
        gender = scanner.next();
        System.out.print("연락처: ");
        scanner.nextLine();
        phone = scanner.nextLine();



        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("주소:" + address);
        System.out.println("성별:" + gender);
        System.out.println("연락처:" + phone);

        /*
        이름 : 최단비
        나이 : 29
        주소 : 경기도 평택시
        성별 : 여자
        연락처 : 010-1234-5678
         */
    }
}
