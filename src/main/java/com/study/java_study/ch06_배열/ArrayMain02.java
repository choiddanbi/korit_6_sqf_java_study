package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {

        // 문자열 "김준일" 주소는 999
        String a = "김준일"; // a에 들어있는 값의 주소는 999다
        String b = new String("김준일"); // 새로운 200번주소 안에 999가 들어있따

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");


        String[] names = new String[2];
        //이거랑
        names[0] = "김준일"; //999
        names[1] = new String("김준일");

        //이거는 같은 말임
        String[] names2 = /*new String[]*/ {"김준일", new String("김준일")};
        // String[] names2 = {"김준일", new String("김준일")}; // 알아서 2개의 공간을 만들어줌


        System.out.println(names[0] == names2[0]); //999 즉 true
        System.out.println(names[1] == names2[1]); // 300번과 400번 즉, false
        System.out.println(names == names2); // 배열 비교, 안에 들어있는 값은 같지만 주소가 다르다 즉, false

        System.out.println(new String[2]); // 배열의 주소
        System.out.println(new String[] {"a", "b"}); // 배열의 주소
        // System.out.println({"a", "b"}); >> 오류
    }

}

// 배열은 순서가 있다
// 배열 안의 값은 중복되어도 된다
// 배열의 공간 크기는 늘리거나 줄일 수 없다 => 늘리거나 줄이고 싶으면 이사해야함 새로운 배열을 만들어서