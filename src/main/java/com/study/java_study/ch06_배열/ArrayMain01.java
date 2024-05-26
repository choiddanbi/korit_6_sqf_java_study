package com.study.java_study.ch06_배열;

public class ArrayMain01 { // 배열을 쓰는 이유 = 반복을 하려고? ?
    public static void main(String[] args) { // 배열도 자료형이다.
        int[] nums = new int[100]; // 변수 = 주소를 저장하기 위한 곳.. 생성자는 ()로 호출 배열은[] 로 크기조정

        for(int i=0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

        // 향상된for문 or ForEach..?
        for(int num : nums) { //nums배열의 [0] 위치부터 [99] 까지 sout 돈다 , 무조건 처음부터 끝까지 반복!! index 를 못쓰는 단점
            System.out.println(num);
        }

        // for(int num : nums) 랑 동일한 코드
        for (int i=0; i < nums.length; i++) {
            int num = nums[i]; // index 가 있으니까 원하는 위치만 꺼내올 수 있는 if(i % 2 == 0) { coutinue; } int num num = num [i]; 가 가능
            System.out.println(num);
        }

        /*for (int i=0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }*/

    }
}
        /*nums[1] = 20;


        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);*/

