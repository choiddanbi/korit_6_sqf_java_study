package com.study.java_study.ch16_제네릭;

import lombok.ToString;

@ToString

// 제네릭 사용!!
public class Sender<T, T2, T3> {
    private T data1;
    private T2 data2;
    private T3 data3;


    // 생성자
    public Sender(T data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    // Getter 와 Setter
    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public T2 getData2() {
        return data2;
    }

    public void setData2(T2 data2) {
        this.data2 = data2;
    }

    public T3 getData3() {
        return data3;
    }

    public void setData3(T3 data3) {
        this.data3 = data3;
    }

    // 매개변수 생성자
    /*public Sender(T data1, T data2) {
        this.data1 = data1;
        this.data2 = data2;
    }*/
}
