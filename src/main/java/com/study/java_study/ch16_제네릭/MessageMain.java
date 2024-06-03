package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {

        // 제네릭 와일드 카드: 기호 ? 사용

        // 변수 선언
        // 이미 정해둔 변수에 자료형을 바꾸고 싶을 떄
        // Message<Integer> m1; 인데 String 입력받고 싶을 때 Message<?> m1; 사용!
        // Message<Object> m1; 이랑 Message<?> m1; 같은 말임 = 지금은 모르겠고 객체 생성할때 자료형을 정하겠따 !!
        Message<?> m1;
        Message<String> m2 = null;

        // m1 = new Message<>("10"); // 이걸 하고싶다 > 이떄 와일드카드 사용!!
        m1 = new Message<>("10"); // 객체 생성 String
        String s = (String) m1.getMessage(); // Object자료형을 String에 넣겠따는 뜻 > 다운캐스팅해줘야함



        // 와일드 카드 제외
       Message<? extends String> m3 = new Message<>("10"); // String을 상속받거나 String인 애들을 와일드카드로 쓰겠따 (자신 포함), 하행
       Message<? super String> m4 = new Message<>(new Object()); // 상행, 형제는 안됨!

       String s2 = m3.getMessage(); // 다운캐스팅 필요없음 ! String부터 시작이니까, extends에서 자식이 들어오면 다운캐스팅해야함

    }
}
