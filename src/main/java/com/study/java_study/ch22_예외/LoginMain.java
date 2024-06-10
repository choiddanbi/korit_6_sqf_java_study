package com.study.java_study.ch22_예외;

import java.util.Scanner;

// 예외 발생시키기 예제
public class LoginMain {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    // 일반 메소드
    // .equals 앞에는 null 이 오먄 안됨! 그래서 변수 userbane보다 상수USERNAME을 앞에 해주는게 조음
    public static void login(String username, String password) throws LoginException { // login 메서드 호출하고싶으면 throws Exception 해주라는 뜻
        if(!(USERNAME.equals(username) && PASSWORD.equals(password))) {
            throw new LoginException("로그인 실패", username); // 예외 강제 실행???????????????
        }
        System.out.println("로그인 성공 ! 이후 절차 진행");
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.print("사용자 이름: ");
        username = scanner.nextLine();
        System.out.print("비밀번호: ");
        password = scanner.nextLine();

        try {
            login(username, password);
        } catch (LoginException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
