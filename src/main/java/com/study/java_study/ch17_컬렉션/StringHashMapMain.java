package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map<K,V> 예제
public class StringHashMapMain {

    public static void main(String[] args) {
        // [ HashMap 클래스 ]
        // HashMap 생성 : HashMap Class인 HashMap<>() 생성
        HashMap<Integer, String> strMap = new HashMap<>(); // strMap 이름의 HashMap<>() 생성

        // 추가 : put
        strMap.put(10, "김준일");
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(13, "김준사");

        // 조회
        System.out.println(strMap);
        // 꺼내기 : get
        System.out.println(strMap.get(11));


        // [ Map 인터페이스 ]
        // Map 생성 > lang 이라는 이름의 Map 인터페이스 생성
        // 생성과 put 까지 다 만들어짐 > Map.of = Map 초기화 // .of 는 데이터 추가, 수정이 안됨
        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        // 조회
        System.out.println(lang);
        // 꺼내기 : get
        System.out.println(lang.get("java"));

        // Map 안에 Entry 가져와 씀
        // for(String key, String value : lang) 가 안됨 > 그래서 entries로 묶어줌 ~
        // entry = set 중복 X, entries : 제네릭
        // Map<String, String> 객체 ( = lang 변수이고, entry 임) 하나하나를 >> Set 객체로 묶어서 entries로 바꿔준다 뜻!
        // entrySet() 메소드! Map -> Set 바꾸고, Set 자료형 안에 Entry들을 넣음
        // 즉, entries 는 entry 들 모음
        // Set : 순서 X, 중복 허용 X
        // lang 전체 key와 value 꺼내기 > Set<Map.Entry<String, String>> 안에 객체들을 entries로 바꾼더ㅏ,,? > SET에 저장
        Set<Map.Entry<String, String>> entries = lang.entrySet(); // Map.Entry<String, String> 는 엔트리, Set<Map.Entry<String, String>> 는 엔트리스
        for (Map.Entry<String, String> entry: entries) { // Map자료형인 lang, Map자료형을 Entry자료형으로 바꾸줘야함, ( k,v = entry, 엔트리들 = set )
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
    }
}

/* 예제
// 1열람실 [Book1, Book2, Book3]
// 2열람실 [Book4, Book5, Book6]

Map<String, List<Book>> library // library 변수라고 부를거다
library.get("1열람실").get(1) // Book1 나옴! library.get("1열람실") 이만큼이 List
*/