package com.study.java_study.ch03_함수;

public class FunctionTest01 {
    int fx01_1() {
        return 10;
    }

    int fx01_2() {
        return 20;
    }

    void printResult() {
        FunctionTest02 functionTest02 = new FunctionTest02();
        System.out.println(functionTest02.getAddData(fx01_1(), fx01_2())); // fx01_1() + fx01_2() 는 참조 안했음 (.) 같은 클래스안에 있으니까
    }

}
