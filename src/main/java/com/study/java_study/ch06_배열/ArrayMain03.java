package com.study.java_study.ch06_배열;

import javax.crypto.spec.PSource;

public class ArrayMain03 {

    // 배열 사용 이유 : 반복문을 위해 + 관련된 데이터들을 하나로 묶기 위해서
    public static void main(String[] args) {
        int[] nums = new int[] { 10, 20, 30, 40, 50, 60 };

        // 순서가 없는 -> 반복문 불가
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int num6 = 60;

        // 순서대로
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        nums[5] = 60;


        String[] strArray = new String[5]; // 배열, 공간생성
        strArray[0] = "a";
        strArray[1] = "b";
        strArray[2] = "c";
        strArray[3] = "d";
        strArray[4] = "e";

        for(int num : nums) {
            System.out.println(num);
        }

        for(String str : strArray) {
            System.out.println(str);
        }

        double[] doubles = new double[3];
        doubles[0] = 10.5;
        doubles[1] = 3.5;
        doubles[2] = 7.5;

        for(double dnum : doubles) {
            System.out.println(dnum);
        }

        Computer[] computers = new Computer[3]; // 배열 객체 생성
        computers[0] = new Computer("13", "8GB");
        computers[1] = new Computer("15", "10GB");
        computers[2] = new Computer("17", "12GB");

        for (Computer computer : computers) {
            System.out.println(computer);
        }

    }

}
