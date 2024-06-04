package com.study.java_study.ch17_컬렉션;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// List<E> 예제 : 인터페이스
public class BookArrayListMain {
    public static void main(String[] args) {

        // 프로그램 시작
        // 도서명: 도서1
        // 저자명 : 저자1
        // new Book("도서1","저자1")
        // BookList에 추가

        // 도서명: 도서2
        // 저자명 : 저자2
        // new Book("도서2","저자2")
        // BookList에 추가

        // 도서명: 도서3
        // 저자명 : 저자3
        // new Book("도서3","저자3")
        // BookList에 추가

        // 도서 전체 조회
        // 도서명 >> 도서1 ~ 3
        // 저자명 >> 저자1 ~ 3

        // 삭제 할 도서명 : 도서2

        // 도서 전체 조회
        // 도서명 >> 도서1, 3
        // 저자명 >> 저자1, 3

        Scanner scanner = new Scanner(System.in);

        // List, bookList 라는 이름의 ArrayList<>()배열 생성
        List<Book> bookList = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            String bookName;
            String author;
            System.out.print("도서명 : ");
            bookName = scanner.nextLine();
            System.out.print("저자명 : ");
            author = scanner.nextLine();

            // 추가 add
            // Book 객체 생성해서 ArrayList 에 담기 > 객체를 바로 넣을 수 있음
            bookList.add(new Book(bookName, author));
        }

        for(Book book : bookList) {
            System.out.println("도서명 >> " + book.getBookName()); // getBookName() 는 Getter, private 이니까 getter로 접근!!
            System.out.println("저자명 >> " + book.getAuthor());
        }


        // 삭제 remove
        // 지우는 방법 2가지 : 인덱스, 값 2가지 방법
        // 값으로 지우는 방법
        System.out.println("삭제 할 도서명 :");
        String removeBookName = scanner.nextLine();
        for(Book book : bookList) {
            if(book.getBookName().equals(removeBookName)) { // getBookName() 는 Getter !
                bookList.remove(book);
                break; // 필수
            }
        }

        // 인덱스로 삭제 방법
        // bookList.get(i)가 주소
        for(int i = 0; i<bookList.size(); i++) {
            if(bookList.get(i).getBookName().equals(removeBookName)) {
                Book removeBook = bookList.remove(i);
                System.out.println("삭제 된 도서 정보 : " + removeBook);
                //bookList.remove(i);
                break;
            }
        }

        // 조회 get
        // 값을 꺼내는 행위! get(i) = list안에서 값을 꺼내오겠따
        for (int i=0; i<bookList.size(); i++) {
            System.out.println("도서명 : " + bookList.get(i).getBookName());
            System.out.println("저자명 : " + bookList.get(i).getAuthor());
        }
    }
}
