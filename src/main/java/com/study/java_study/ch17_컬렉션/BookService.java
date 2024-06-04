package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookService {
    // 싱글톤 패턴

    private static BookService instance; // static!

    // 밖에서 new BookService 못하게 하려고 생성자에 private 걸어줌 - 싱글톤을 위ㅐ해
    // 단, 같은 클래스 안에서는 private이어도 생성 가능 ( new 가능 )
    private BookService() {}

    // 메소드
    public static BookService getInstance() { // 자기자신 (BookService) 을 리턴
        if(instance == null) {
            instance = new BookService(); // 동적할당 , BookService() 객체 주소 넣기
            }
        return instance;
        }


    private List<Map<String, Object>> bookDB = List.of( // List 들에 Map들을 넣겠따! 키 = String , 값 = Object
            Map.of(
                    "bookId", 1,
                    "bookName","자바의 정석"
            ),
            Map.of(
                    "bookId", 2,
                    "bookName","파이썬의 정석"
            ),
            Map.of(
                    "bookId", 3,
                    "bookName","데이터베이스의 정석"
            )
    );

    // 일반 메소드
    public void run1() {
        System.out.println("도서 전체 정보를 요청합니다.");
        run2();
    }


    public void run2() {
        System.out.println("도서 전체 정보 요청을 받았습니다.");
        List<BookEntity> bookEntities = run3();
        BookRequestDto bookRequestDto = new BookRequestDto(200, "조회 완료", bookEntities);
        run4(bookRequestDto);
    }


    public List<BookEntity> run3() {
        System.out.println("데이터 베이스에서 도서 전체 정보를 조회합니다.");
        List<BookEntity> bookEntities = new ArrayList<>(); // BookEntity 를 담을 ArrayList
        // bookDB -> bookentity 로! > bookEntities에 넣기
        // bookDB의 경우 List 에서 하나 꺼내면 Map !!
        // Map에 들어 있는 것들을 book으로 !
        for(Map<String, Object> bookMap : bookDB) {
            BookEntity bookEntity = new BookEntity(
                    (int)bookMap.get("bookId"), // String -> int 다운캐스팅!
                    (String)bookMap.get("bookName") // Object -> String 다운캐스팅!
            );
            bookEntities.add(bookEntity);
        }
        return bookEntities;
    }


    public void run4(BookRequestDto bookRequestDto) {
        System.out.println("데이터 베이스의 정보를 요청한 클라이언트에게 응답합니다.");
        System.out.println("[ 응답 데이터 ]");
        System.out.println(bookRequestDto);
    }
}
