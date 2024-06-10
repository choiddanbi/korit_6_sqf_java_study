package com.study.java_study.ch22_예외;

import com.study.java_study.ch18_빌더.A;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("신선애");
        names.add("김동인");
        names.add("백승주");
        names.add(null); // 얘때문에 NullPointer 예외가 뜨는데 예외처리해서 일단 실행은 되는고

        try {
            // names.forEach(name -> System.out.println(name.toString()));
            for(int i=0; i<5; i++) { // 이거하면 4번째 반복에서 예외가 떠서 "트라이 마지막 부분이" 이게 실행 안됨 ( 즉, try안에서 예외뜨면 그 다음꺼는 실행안해 )
                System.out.println(names.get(i).toString());
            }
            System.out.println("트라이 마지막 부분"); // 이게 실행 안됨
        } catch (NullPointerException e) {
            e.printStackTrace(); // 무슨 오류인지 ??, 비동기호출
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) { // 필수 ~, 어떤 예외든 업캐스팅 되어서 예외처리 됨
            e.printStackTrace();
        } catch (Throwable e) { // 필수? 얘가 찐 최종! 젤 높은 애
            e.printStackTrace();
        } finally { // 예외가 나와도 얘는 무조건 실행됨
            System.out.println("예외이든 아니든 실행");
        }

        System.out.println("프로그램 종료");
    }
}
