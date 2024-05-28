package com.study.java_study.ch09_클래스04;

// 정보 가공 ?
import java.util.Scanner;

public class BookService { // 기능 클래스
    private Scanner scanner; // 같은 클래스 안에서 scanner 객체를 계속 사용 ㄱㅏ능
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }


    // 메서드 1.
    private String selectMenu() {
        String menus = "1234q";
        String selectedMenu = null;

        while (true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if(menus.contains(selectedMenu)) { // menus 에 있는 값을 입력하면 if문 끝!
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;
    }

    // 메서드 2.
    public boolean run() {
        boolean isRun = true;

        System.out.println("[ 도서 관리 프로그램 ]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu(); // 메서드1 호출
        // selected 로 리턴 받은 걸 사용해야한까 그냥 selectMenu() 가 아닌 String sele~~~

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook(); // 호출 !
                break;
            case "2":
                search();
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println("입력 오류");
        }
        System.out.println();

        return isRun;
    }


    // 메서드 3. 공백체크
    // String 으로 리턴됨
    private String validateValue(String title) {
        String value = null;
        while(true) {
            System.out.print(title + "명 입력 : ");
            value = scanner.nextLine();
            if (!value.isBlank()) { // blank : 띄어쓰기 미포함_띄어쓰기도 공백으로 본다 (문자열객체에서 사용) , empty : 띄어쓰기 포함
                break; // return value; 로 감
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시 입력하세요"); // 다시 while문으로 감
        }
        return value; // value = 내가 입력한 거
    }

    // 메서드 4. 중복체크
    private String duplicateBookName() {
        String bookName = null;
        while (true) {
            bookName = validateValue("도서"); // 내가 입력한 도서명(value)을 bookName에 넣기
            // 도서명 중복체크
            if (bookRepository.findBookByBookName(bookName) == null) {
                // blank : 띄어쓰기 미포함_띄어쓰기도 공백으로 본다 (문자열객체에서 사용) , empty : 띄어쓰기 포함
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요");
        }
        return bookName;
    }



    // 메서드 5. 도서 등록
    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();
        String author = validateValue("저자"); // validateValue 에서 키보드로 입력받음
        String publisher = validateValue("출판사"); // validateValue 에서 키보드로 입력받음

        BookEntity book = new BookEntity(bookId, bookName, author, publisher); // book 객체 생성 ! > BookEntity클래스의 생성자 쓰려고 ~
        bookRepository.saveBook(book); // 도서 등록 !!
        System.out.println("새로운 도서를 등록하였습니다.");
    }


    // 메서드 6. 도서검색
    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합검색");
        System.out.println("2. 도서명검색");
        System.out.println("3. 저자명검색");
        System.out.println("4. 출판사검색");
        System.out.print("옵션 선택 : ");
        int option = scanner.nextInt(); // int 정수만 옵션으로 입력
        scanner.nextLine(); // 공백 버퍼 날리기
        System.out.print("검색어 입력 : ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("[ 검색 결과 ]");

        if (searchBooks.length == 0){
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for (BookEntity book : searchBooks) {
            System.out.println(book.toString());
        }
    }
}


