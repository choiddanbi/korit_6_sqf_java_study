package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal {
    public int power;

    // 기본 생성자
    public Tiger() {
        super(); // super(); = 부모객체(=Animal객체) 생성, super = 부모의 주소
        System.out.println("호랑이 객체 생성");
    }


    // 매개변수 생성자 + 부모꺼까지
    // >> name, age 도 main 에서 한번에 입력하고싶은데 그러려면 super( 부모 ) 의 객체 도 생성해줘야함 >> super(name, age);
    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }


    // 메서드
    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다.");
    }

    // 생성자 : 애니멀과 타이거는 같은 메모리에 있는데 move()라는 메서드는 이미 애니멀에 있따 > 오버로드 사용
    // 원래는 error 나야하는데 안남 = 재정의
    // 재정의 --> 상속관계에서만 가능 ( @Override )
    @Override // @ 는 어노테이션 !! >> 재정의했다는거 티낼라구 적은거, 없어도 됨
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move(); // Animal 의 move도 쓰고싶어서
    }


    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }


}


