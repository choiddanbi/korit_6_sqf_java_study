package com.study.java_study.ch08_클래스03;

public class Color {
    private String code;
    private String name;

    // Alt + Insert
    // AllArgsConstructor, 매개변수가 있는 생성자
    public Color(String code, String name) {
        this.code = code; // 변수에 매개변수를 넣겠다
        this.name = name;
    }

    // NoArgsConstructor, 기본생성자
    public Color() {
    }

    // Alt + Insert
    // getter (출력) 와 setter (입력)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("색상 코드 : " + code );
        System.out.println("색상명 : " + name );
    }
}
