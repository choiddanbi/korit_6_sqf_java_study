package com.study.java_study.ch04_제어;

public class 스위치 {

    public static void main(String[] args) {
        String grade = "C";
        switch (grade) {  // case 중에 C를 찾아서 그 위치부터 밑으로 쭉 실행시켜라 >> break 걸어주면 거기서 멈춰라! C등급만 프린트
            case "A":
                System.out.println("A등급");
                break;
            case "B":
                System.out.println("B등급");
                break;
            case "C":
                System.out.println("C등급");
                break;
            case "D":
                System.out.println("D등급");
                break;
            default:
                System.out.println("F등급");
        }
    }
}
