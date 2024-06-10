package com.study.java_study.ch22_예외;

/*
   예외(오류)
   1. 컴파일 오류 -> 프로그램이 실행(메모리에 할당) 되기 전에 오류
   2. 런타임 오류 -> 프로그램이 실행(메모리에 할당) 된 후에 오류 >

   // 꿀팁 : 예외가 터지면 맨 윗줄 메시지를 봐야함!!
 */

public class ArrayExceptionMain {
    // 메소드
     public static void printArray(Integer[] nums, int length) throws Exception { // 메소드를 호출하는 곳에서 예외처리 해라
         for (int i = 0; i < length; i++) {
             System.out.println("1 : " + nums[i]);
         }
     }


    public static void main(String[] args) { // 여기서 printArray() 메소드 호출할거라서 여기서 try-catch 로 예외처리 했다!!
        Integer[] nums = new Integer[] {1,2,3,4,5};
        try {
            printArray(nums, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
