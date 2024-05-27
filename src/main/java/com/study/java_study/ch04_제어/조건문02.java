package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String(""); // "" 은 리터널이다.. ==는 값비교가 아닌 주소값비교
        String name = "";      // 값의 자료형이 String
        String phone = null;   // 값의 자료형이 null

        StringUtils stringUtils = new StringUtils();

        if (stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return; // 함수의 return 자료형ㅇ이 void 일때 사용 가능!! = 조건이 참이면 끝까지 가지말고 중간에 끊어라는 뜻
        }

        if (stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return;
        }
    }
}
