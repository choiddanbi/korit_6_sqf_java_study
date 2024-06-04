package com.study.java_study.ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor // 생성과 동시에 값 넣을때 사용하는 생성자..?
@NoArgsConstructor
@Setter
public class Data {
    private String data1;
    private int data2;
    private double data3;
    private String data4;


    // 생성자 오버로딩
    public Data(String data1) {
        this.data1 = data1;
    }

    public Data(int data2) {
        this.data2 = data2;
    }

    public Data(double data3) {
        this.data3 = data3;
    }

}
