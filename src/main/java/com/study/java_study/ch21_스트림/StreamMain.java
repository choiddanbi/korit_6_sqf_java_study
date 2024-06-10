package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 스트림은 인터페이스다!
// 보통 스트림 안에 static 메소드들을 가져와서 씀
public class StreamMain {
    public static void main(String[] args) {

        /* 스트림의 구조 : 스트림은 일회성이다 ( 복사가 아니고 값을 꺼내서 쓰는거다 ) >
         생성(사용) 절차
           1. 배열 생성 -> 이후에 스트림으로 변환 : Arrays.stream
           2. List 생성 -> 이후에 스트림으로 변환
           3. generate 메소드 -> 를 통해서 스트림 생성
           4. 범위 지정 -> 을 통한 스트림 생성
           5. 빌더 -> 를 통해서 스트림 생성

         중간(가공) 절차 - 스트림 메소드들
           1. map() 메소드 : map(Function) // 가공해서 새로운 스트림에 넣겠따- Function : 매개변수 O, 리턴 O
           2. filter() 메소드 : filter(Predicate) // 조건에 맞는 애들만 새로운 스트림에 넣겠따 : 매개변수 O, 리턴 O
           3. sorted() 메소드 : sorted(Comparator) // 정렬

         최종(결과) 절차
           1. collect() 메소드 : Stream 을 List 로 변환
           2. 반복자 -> forEach 에서 주로 사용

         .stream() : ~를 스트림으로 !! // 스트림에 옮겨 담겠다
        */

        // 배열을 통한 스트림 생성
        Stream<Integer> st1 = Arrays.stream(new Integer[] {1,2,3,4,5}); // 스트림 생성 ( 배열을 스트림으로 = 스트림에 옮겨 담는다)
        List<Integer> numberList = st1.map(n -> n * 2) // 가공, Integer[] 안에 값들 하나하나를 n이라는 변수로 부를거야!! ( =스트림 안에 하나하나 값들, 스트림으로 옮겨 담았으니까 !!!)
                .peek(n -> System.out.println(n)) // 가공(기타 스트링 메소드) - 확인용
                .collect(Collectors.toList()); // 최종
        // map 메소드 : 스트림에서 배열의 값을 하나씩 꺼내와서 새로운 스트림에 담아라 ..
        // peek 매소드 : 스트림 실행할 때 중간중간에 결과값 출력
        // collect 메소드 : collect 로 받은 스트림값을 List 로 바꿔라

        System.out.println();
        numberList.forEach(n -> System.out.println("n :" + n));


        // List 를 스트림으로 변환
        // List 인 numberList 를 -> Stream 으로 변환 -> map 으로 가공해서 새로운 스트림에 담고
        // -> filter 메소드로 가공해서 새로운 스트림에 또 담고 -> collect 로 다시 List 화 시킴
        List<Integer> filteringNumber = numberList.stream() // 스트림 생성 ( 리스트 -> 스트림으로 )
                .map(n -> n / 2) // 가공1, numberList의 List 안에 값들을 n이라고 부를거야 ~ ( 2 * n 한 애들, = 스트림 안에 값들! 리스트 값들을 스트림에 담아준거니까 )
                .filter(n -> n % 2 == 0) // 가공2
                .collect(Collectors.toList()); // 최종

        System.out.println(filteringNumber);


        List<Integer> sortedNumberList = numberList.stream() // 스트림 생성
                .sorted((o1, o2) -> o2 - o1) // 가공 : 내림차순 정렬
                .collect(Collectors.toList()); // 최종

        System.out.println("내림차순 정렬");
        System.out.println(sortedNumberList);


        // 빌더를 통한 스트림 생성
        Stream<String> nameStream = Stream.<String>builder()
                .add("손경태")
                .add("최단비")
                .add("김지현")
                .add("정령우")
                .add("이성민")
                .build();
        System.out.println("[이름 정렬]");
        // nameStream.sorted().forEach(name -> System.out.println(name)); // 정렬 안되어있음
        // nameStream 의 o1, o2 는 String 인데 String 은 '-'(빼기) 가 안되니까
        // Objects.hash 해줘야함 >> 그래서 해쉬가 몬데ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
        // nameStream.sorted((o1, o2) -> Objects.hash(o2) - Objects.hash(o1)).forEach(name -> System.out.println(name)); // 내림차순
        // 간단하게 String 내림차순 방법 : String.CASE_INSENSITIVE_ORDER.compare(o2,o1))
        nameStream.sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2,o1))
                .forEach(name -> System.out.println(name));



        // phoneList 라는 List 생성, 바로 값 넣기
        List<Phone> phoneList = List.of(
          Phone.builder().number(1).model("아이폰").build(),
          Phone.builder().number(2).model("갤럭시").build(),
          Phone.builder().number(3).model("샤오미").build()
        );


        // 새로운 스트림 생성 후 map 으로 number * 2 으로 가공 ->
        // 새로운 스트림과 기존 스트림의 주소는 같다
        /*
        phoneList.stream().map(phone -> {
            phone.setNumber(phone.getNumber() * 2);
            return phone;
        }); */

        // List 를 새로운 폰 객체 생성 (주소바뀜) 해서 새로운 스트림에 넣어라 > 음 ???
        // map 사용 , 가공
        phoneList.stream().map(phone -> Phone.builder()
                .number(phone.getNumber() * 2)
                .model(phone.getModel())
                .build())
                .forEach(phone -> System.out.println(phone));


        // filter
        System.out.println();
        phoneList.stream()
                 .filter(phone -> phone.getNumber() % 2 != 0 )
        .forEach(phone -> System.out.println(phone));


        // sorted
        System.out.println();
        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));


        // model 이름으로 정렬
        System.out.println();
        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                .forEach(phone -> System.out.println(phone)); // forEach(System.out :: println); 으로도 작성 가능......
    }
}
