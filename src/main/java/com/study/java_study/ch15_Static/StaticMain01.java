package com.study.java_study.ch15_Static;


/*
    스태틱(Static)
    1. 공유 영역
    2. 스태틱 변수나 메소드는 클래스명. 을 통해 접근한ㄷㅏ. > 객체 생성해서 접근해도 됨 ( 객체 생성 없이 바로 사용 가능 )

 */

public class StaticMain01 {
    public static void main(String[] args) {
        // num 은 객체 생성 없이 사용중이다 > static 때문에
        // Static01 static = new Stactic01(); 해야하는데.. 안해도 됨 > 변수 num이 static 이라서
        System.out.println(Static01.num);
        Static01.num = 20; // 클래스명.num
        System.out.println(Static01.num);

        Static01 static01 = new Static01(); // 이거 안해주고 바로 해도 됨
        static01.num = 30;
        System.out.println(Static01.num); // 클래스타입.num > ??????? static 이 아닌 Static으로 해..... > 객체를 넣어도 똑같다?
    }
}
