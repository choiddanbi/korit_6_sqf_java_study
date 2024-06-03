package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// List<E> 인터페이스 예제1
public class StringArrayListMain {
    public static void main(String[] args) {

        // ArrayList 생성
        ArrayList<String> strList = new ArrayList<>(); // ArrayList 자료형인 ArrayList<>() 생성
        // 이렇게 생략도 가능! new ArrayList<String>();
        // 추가 : add > ArrayList 클래스에 선언되어있는 add 를 쓰겠따!!
        strList.add("test1");


        // 일반 배열 생성
        String[] strArray = new String[10];

        // [ 배열 <-> ArrayList ]
        // Arrays.asList() : 배열을 리스트로 변환
        // List인 list 생성
        List<String> list = Arrays.asList(strArray); // 배열 -> List 로, strArray 가 String = 매개변수사용,,? 제네릭이 String, List 자료형인 ArrayList<>() 만들음, (list)
        ArrayList<String> list2 = new ArrayList<>(); // ArrayList인 ArrayList<>() 생성 (list2)
        list2.addAll(list); // list 들을 list2에 다 넣겠따
        strList.toArray(new String[strList.size()]); // ArrayList -> 배열로, > String 리턴, strList 크기 만큼! > strList를 새로 만든 new String[strList.size()] 배열로 !!
        /*String[] arr = new String[5];
        arr = list.toArray(arr); 참고 */


        // 리스트 값 조회
        System.out.println(strList); // strList 주소가 떠야하는데 오버라이딩 되어진 toString이 호출됨!

        // contains : 포함 + 조회
        System.out.println(strList.contains("test1")); // strList 가 test1 문자열을 포함하고있닝 ? > true

        // 리스트 바로 생성 > ArrayList 쓰고싶으면 add로..?
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums);

        // 제거 : remove
        // remove (index)이면 제거하면서 가지고나왔으니 쓸거면 써라
        // remove (Object o)이면 제거만!
        // removeAll 값이 일치하면 지워라
        strList.add("김준일");
        strList.add("김준이");
        strList.add("김준삼");
        System.out.println(strList);
        System.out.println(strList.remove("test1")); // true
        System.out.println(strList.remove("test2")); // false
        strList.remove("test1");
        System.out.println(strList);
        System.out.println(strList.remove(1)); // 김준이 > 를 지웠다는 뜻
        System.out.println(strList); // 김준일, 김준삼 만 남음!!
        System.out.println();

        System.out.println(nums); // List 1,2,3,4,5 들어있음
        List<Integer> nums2 = List.of(1,3,5);
        ArrayList<Integer> nums3 = new ArrayList<>(); // ArrayList num3 만들기
        nums2.addAll(nums3); // ArrayList num3 로 다 옮김
        System.out.println(nums3.removeAll(nums2));
        System.out.println(nums3);

        // 중간에 삽입
        // 오버로딩 되어진 add들 중 골라서 쓰기 nums3.add
        // 수정 : set
        nums3.set(0,10);
        System.out.println(nums3);
        nums3.addAll(List.of(1,2,3));
        System.out.println(nums3);

        // 꺼내기 : get > 반복
        for(int i=0; i<nums3.size(); i++) {
            System.out.println(nums3.get(i));
        }

        // 꺼내기 : get을 foreach 로 바꾸면
        for(Integer num : nums3) {
            System.out.println(num);
        }

        // Iterator 로 반복 돌리기
        Iterator<Integer> ir = nums3.iterator();
        while(ir.hasNext()) {
            System.out.println(ir.next());
        }
    }
}
