package com.study.java_study.ch09_클래스04;


// DB에 들어갈 것들 ?
// 정보 저장소 -> CRUD // 생성 읽기 업로드 삭제
public class BookRepository {
    private int bookId;
    // 배열 생성 - 공간 , books라는 BookEntity자료형 배열 만들기
    private BookEntity[] books;

    // 생성자 에 넣은 이유 : 종속성 주입.., 생성자 호출 ??
    public BookRepository() {
        books = new BookEntity[0];
    }

    // 자동으로 bookId 하나씩 증가
    public int autoIncrementBookId() {
        return ++bookId;
    }


    // 메서드들 1 ~ n개

    // 메서드1 : 배열 이사
    private void extendBooks() { // Repository 안에서만 쓰는 메서드니까 private 로!!
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기본 배열의 정보를 새로운 배열로 모두 이사! 이때 마지막 인덱스의 값은 빈값
        for(int i=0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        books = newBooks; // 기존의 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입_다시 원복 !!
    }


    // 메서드1-1. books 배열의 마지막 인덱스 값
    private int getLastIndex() {
        return books.length - 1;
    }


    // 메서드2. 마지막 배열 인덱스에 book 객체 대입
    // saveBook 에서 BookEntity 자료형인 book 이라는 객체를 받아와서 book 배열 마지막 인덱스에 저장
    public void saveBook(BookEntity book) {
        extendBooks(); // 배열 확장, extend(); 메서드 호출 !!

        books[getLastIndex()] = book;

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입
        // books[books.length - 1] = book;
    }


    // 메서드3. bookId로 원하는 book 객체 찾기
    // book 을 찾으면 BookEntity 로 return 해준다는 뜻 !
    // 선형탐색 > 하나씩 끝까지 비교하면서 찾음, 트리 > 기준 잡고(?) 찾기
    // 메서드 표현법 => public static 리턴타입 메서드명(매개변수) { }
      public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null; // 책을 찾았나 못찾았나 확인하려고, 변수?
        // 선형탐색, for-each 문 사용
        // BookEntity bookEntity = new BookEntity(); 왜 안해줌 ???
        // -> BookEntity 는 클래스를 가져다 쓴다는게 아니고 BookEntity 라는 자료형을 표시해준거니까
        for(BookEntity book : books) { // books[0 1 2...]를 book 에 대입해서 if문 !! > books 배열 안에 인덱스 하나하나들이 book ~
            if(book.getBookId() == bookId) { // int bookId 와 book객체 안에 BookId 값이 같다면
                findBook = book; // book 객체를 findBook 에 넣어라
                break;
            }
        }
        return findBook;
    }


    // 메서드4. bookName 으로 원하는 book 객체 찾기
    // 단건조회 : 중복되는 이름이 없다는 가정하에 하나만 !! > 중복체크 필수
    // BookEntity 로 리턴 !! - 변수로 1개만 리턴받음
    // 여러개 리턴 받고싶으면 배열로 리턴 받아야함
    // 중복체크에서 사용
    public BookEntity findBookByBookName(String bookName) { // 매개변수 bookName, 리턴은 BookEntity 이름을 find~
        BookEntity findBook = null;

        for(BookEntity book : books) { // books 에 있는 인덱스 값들 하나씩을 BookEntity 자료형인 book에 넣ㅇ어라
            if (book.getBookName().equals(bookName)) { // String bookName 과 배열이 같다면
                findBook = book;
                break;
            }
        }
        return findBook;
    }


    // 메서드5. bookName, author, publisher 정보로 원하는 book 객체 찾으면, "배열크기 하나 늘리기" = searchBooks 배열의 크기 결정
    // books[5] 짜리 배열이 있는데 그 안에 a를 포함하는게 books[0], books[3], books[4] 총 3개가 있다면, newArraySize = 3
    // 이거를 searchBooks 메소드로 보내 ~
    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1: // 검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText) // books 배열에서 book 을 꺼냈을떄 getBookName()문자열에 bookName문자열이 포함된 게 있으면
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;

            case 2: // 도서명검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;

            case 3: // 저자명검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;

            case 4: // 출판사명검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }

        return newArraySize;
    }



    // 메서드6. BookName, Author, Publisher 로 원하는 book 찾고, searchbooks 배열로 이사 !
    // 다건조회
    // ex) A 라고 조회하면 책이름 or 출판사명에 a가 들어간 게 여러개 일 수 있으니까
    // 그렇게 여러개가 나오면 searchBooks배열 크기를 하나씩 늘려가면서 거기에 정보를 담는다 !!!
    /* ex) 위에서 받은 newArraySize = 3 으로 searchBooks[3] 만들어졌고,
     searchBooks[0] = books[0];
     searchBooks[1] = books[3];
     searchBooks[2] = books[4];
     이렇게 값이 들어간거다 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ */
    public BookEntity[] searchBooks(int option, String searchText) { // 리턴은 배열이고 이름을 searchBook 으로

        int newArraySize = getNewArraySize(option, searchText); // 찾아서 배열에 넣기 위해서 ! 검색된 책이 몇권인지..
        BookEntity[] searchBooks = new BookEntity[newArraySize]; // searchBooks[newArraySize] 새로운 배열 생성

        // 전체 배열에서 조건에 맞는 배열을 찾아서 searchBooks 에 넣기
        int i = 0;

        // 여러 case 중에서 하나만 선택해서 동작
        switch (option) {
            case 1: // 통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText) // books에서 book 을 꺼냈을떄 getBookName()문자열에 bookName문자열이 포함된 게 있으면
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book; // searchBooks배열에 해당 books인덱스에 있는 값 넣기
                        i++; // 새로 만든 배열의 인덱스 증가 !
                    }
                }
                    break;


            case 2: // 도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;

            case 3: // 저자명검색
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;

            case 4: // 출판사명검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
        }
        return searchBooks;
    }
}
