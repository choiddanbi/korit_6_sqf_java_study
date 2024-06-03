package com.study.java_study.ch17_컬렉션;

import java.util.*;

// SET<E> 인터페이스 예제
public class StringHashSetMain {
    public static void main(String[] args) {

        // strset 이라는 이름으로 HashSet 클래스 만들음
        HashSet<String> strSet = new HashSet<>();

        // 추가 add > Hash값으로 정렬되어서 들어감
        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet); // 값 확인

        // set 은 인덱스가 없다! > i로 반복문 돌릴수가 없다 > 무조건 foreach문!!
        for(String name : strSet) {
            System.out.println(Objects.hash(name));
        }

        // List 면 김준일2개 김준이1개 이어야하는데
        // set이라 중복제거 되어서 나옴
        strSet.addAll(List.of("김준일","김준일","김준이"));

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);

        // 이거랑
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1,o2);
            }
        };
        strList.sort(stringComparator);

        // 이거랑 똑같은거!!
        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1,o2));
        System.out.println(strList);

    }
}
