package com.study.java_study.ch19_익명클래스;

public class KiaCar extends AbstractCar {

    // 생성자
    public KiaCar(String model, String color) {
        super(model, color);
    }

    // 메소드 오버라이드
    @Override
    public void createCar() {
        System.out.println("기아 자동차를 생산합니다.");
    }

    // 메소드 오버라이드
    @Override
    public void showCar() {
        System.out.println("차량 정보 조회.");
    }

}
