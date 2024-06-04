package com.study.java_study.ch19_익명클래스;

import org.w3c.dom.ls.LSOutput;

public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar);


        /* 이거도 익명클래스
        KiaCar kiaCar2 = new KiaCar("k8","블랙") {
            @Override
            public void createCar() {
                super.createCar();
            }
        */


        // 객체를 만들긴할건데 -> 한 번ㅁ ㅏㄴ 쓰고 재사용 안할거다! > 굳이 클래스를 새로 안만들고 > 익명클래스 사용
        // 익명클래스 : 일회용
        // 클래스명 변수명 = new 클래스명() {
        //		클래스의 메서드 오버라이딩
        //		}
        AbstractCar abstractCar = new AbstractCar("내가만든자동차", "블랙") { // 요기부터 클래스파일인데 굳이 안만들어!!! 일회용이니까 ) extends {
            // 여기에다가 임시로 클래스 하나르 ㄹ정의하겠따
            // 클래스 즉시 구현
            @Override
            public void createCar() {
                System.out.println("한번 만들어봄");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보....");
            }
        };

        System.out.println(abstractCar);
    }
}
