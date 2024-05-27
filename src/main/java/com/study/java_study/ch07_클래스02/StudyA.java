package com.study.java_study.ch07_클래스02;

public class StudyA {
    int num;
    int num2;

    // 생성자
    // 1. 클래스명과 동일
    // 2. 리턴 자료형이 없다.
    // 3. 생성자는 무조건 할당된 메모리의 주소를 리턴한다(???)
    // NoArgsConstructor, 매개변수 없는 생성자

    StudyA() { // StudyA = 생성자 이름이면서 리턴자료형이다
        System.out.println("스터디 에이 객체 생성");
        }

        // AllArgsConstructor, 매개변수가 있는 생성자
    StudyA (int num, int num2) {
         System.out.println("스터디 에이 객체 생성");
         this.num = num; // this.num 은 맨 위에 변수의 num 이고, 뒤에 num은 StudyA(int num, 매개변수 num이다 ...
         this.num2 = num2; // this 는 나 자신의 주소다?
        }


    // increase, decrease 라는 메소드 , ~num이라는 매개변수
    // return 이 void 면 계산한 값을 변수에 담을수 없다ㅠㅠ
    void increase(int increaseNum) {
        num += increaseNum;
        num2 += (increaseNum * 2);
    }

    void decrease (int decreaseNum) {
        num -= decreaseNum;
        num2 -= (decreaseNum * 2);
    }
}
