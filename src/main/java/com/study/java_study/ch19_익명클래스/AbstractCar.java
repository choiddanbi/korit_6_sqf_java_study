package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
// 추상클래스
public abstract class AbstractCar {

    private String model;
    private String color;

    // 추상메소드
    public abstract void createCar();
    public abstract void showCar();
}
