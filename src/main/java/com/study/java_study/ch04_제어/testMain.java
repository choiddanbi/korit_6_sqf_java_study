package com.study.java_study.ch04_제어;

public class testMain {
    public static void main(String[] args) {

        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        String str4 = new String("test");


        System.out.println(str1==str3); //false == 는 주소값 비교
        System.out.println(str1==str2); //true
    }
}
