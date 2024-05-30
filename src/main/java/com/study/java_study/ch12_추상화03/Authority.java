package com.study.java_study.ch12_추상화03;
// 기능

/*
    인터페이스의 특징 ( 상수 + 추상메소드로 필수 구성 + 추가로 일반메소드도 가능_선택 )
    1. 일반클래스와 동일하게 정의 할 수 없다.
    2. 일반 변수(=멤버변수)를 정의 할 수 없다
    3. 무조건 상수만 정의 할 수 있따.
    4. 일반메소드(=멤버메소드)를 정의하기 위해서는 default 키워드를 사용해야한다.
    5. 추상메소드를 정의 할 때 abstract 키워드를 생략 할 수 있따.
    6. 인터페이스 안에 정의되어있는 모든 상수와 메소드들은 public 접근지정자를 사용한다.
 */

// 인터페이스
public interface Authority {
    // static final 가 생략
    // public static final String DEFAULT_ROLE = "ROLE_USER";
    public String DEFAULT_ROLE = "ROLE_USER"; // DEFAULT_ROLE 는 상수임! final 이 생략된거


    // public abstract 가 생략
    // public abstract String getAuthority();
    // (); 면 abstrct 고, {} 면 메소드다
    // 추상클래스 ? 메소드 ?
    String getAuthority();

    // public 가 생략
    // default void printAuthority() {
    // default 는 접근지정자가 아니고,
    // 일반메소드 !
    default void printAuthority() {
        System.out.println(DEFAULT_ROLE);
    }

}
