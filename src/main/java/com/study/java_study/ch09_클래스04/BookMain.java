package com.study.java_study.ch09_클래스04;

public class BookMain {

    public static void main(String[] args) {

        BookService bookService = new BookService(); // 메서드 호출 = 객체생성

        System.out.println("프로그램을 실행합니다.");

        while (bookService.run()) {}

        System.out.println("프로그램을 종료합니다.");

    }
}
