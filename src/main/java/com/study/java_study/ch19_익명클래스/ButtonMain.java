package com.study.java_study.ch19_익명클래스;

public class ButtonMain {
    public static void main(String[] args) {

        Button homeButton = new HomeButton(); // HomeButton() 생성자로 객체를 만들기 자료형은 Button
        // click(new HomeButton()); 과 동일

        // click(new Button(){ 안에 @어쭊 ~ } 과 동일
        // 익명클래스
        // 인터페이스명 변수명 = new 인터페이스명() {
        //		인터페이스의 메서드 오버라이딩
        //	}
        // Button()은 인터페이스라 생성은 안되는데, 오버라이드는 됨!!
        Button loginButton = new Button() {
            @Override // Button 인터페이스의 OnClick 메서드를 오버라이드!!
            public void onClick() {
                System.out.println("로그인 하기");
            }
        };

        click(homeButton); // homeButton.onClick
        click(loginButton);

    }

    // static 메소드
    public static void click(Button button) {
        System.out.println(button.getClass()); // getClass() = 어느 클래스에서 가져왔는지 알려줌
        button.onClick();
    }
}
