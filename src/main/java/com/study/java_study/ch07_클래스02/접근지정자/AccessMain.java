package com.study.java_study.ch07_클래스02.접근지정자;

import com.study.java_study.ch07_클래스02.StudyB; // 다른 패키지 안에 있는 클래스를 참조하려면 import 해줘야함 !

/*
접근지정자 : 다른 패키지에 있는 함수나 클래스를 불러다 쓸때 공개 허용 범위(?)로 사용 //
 - public : 여기저기서 다 쓸거야
    -> 모든 영역에서 접근 할 수 있따 ~ > 다른 패키지에 있더라도 ~

 - private : 내꺼 클래스 안에서만 공개해줄거야 ! // 자기 클래스 안에서는 접근 가능하나, 외부에서는 접근 불가능
    -> 같은 객체 안에서만 접근 할 수 있다 ~ ( 같은 클래스안에서 )

 - default : 같은 패키지 안에서만 접근 할 수 있따 ~ > 앞에 아무것도 안적으면

 - protected : default 와 동일하나 같은 패키지 안에서 접근 할 수 있고, 상속관계일 때에는 다른 패키지에 있어도 접근할 수 있따 ~
 */

public class AccessMain {
    // 변수
    private String test;

    // 메서드
    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB("최단비", 29);
        b.show();
        b.setName("김준이");
        System.out.println(b.getName());

       /* StudyB b = new StudyB();
        // printTest(); --> 그냥 이거만 쓰면 안됨
        AccessMain accessMain = new AccessMain();
        accessMain.printTest();
        accessMain.test = "테스트"; // private 인데도 된 왜냐면 같은 클래스니까..
        */

    }
}
