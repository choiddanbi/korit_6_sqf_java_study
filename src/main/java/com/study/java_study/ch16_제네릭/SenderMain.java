package com.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {
        /* [ Wrapper 자료형 = 객제 자료형 ]
        Integer                     int
        Boolean                    boolean
        Character   ---(언박싱)--->  char
        Double      <---(박싱)---   double
        Long                        long
        Float                       float
         */

        // 박싱 언박싱 수동
        Integer num = new Integer(10); // 10이라는 int 리터럴 자료형을 박싱 !!
        int num2 = num.intValue(); // 언박싱 해서 num2에 넣는다

        // 박싱 언박싱 자동 > 클래스객체안에 포장하게따
        Integer num3 = 20; // 박싱 : Wrapper 클래스 자료형으로 ~
        int num4 = num3; // 언박싱 : 일반자로형으로 ~


        // 제네릭 : 객체생성 (=메모리 할당) 한 시점에 자료형을 정해주겠따
        // 제네릭 사용해서 가능!
        Sender sender1 = new Sender<Integer, String, Double>(10, "20", 3.14); // 일반자료형은 안됨!!  Wrapper 자료형 사용 또는 우리감가 만든 객체자ㅣㅏ료형!
        // Sender <Integer, String, Double> sender1 = new Sender<>(10, "20", 3.14); //도 가능!, 생략 가능
        System.out.println(sender1);
    }
}
