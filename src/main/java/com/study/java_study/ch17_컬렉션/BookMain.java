package com.study.java_study.ch17_컬렉션;

public class BookMain {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        BookService.getInstance().run1(); // getinstance가 static이니까 클래스명. >> BookService.getInstance() 이게 instance > 즉, instance().run1()


        System.out.println("프로그램 종료");

    }
}
