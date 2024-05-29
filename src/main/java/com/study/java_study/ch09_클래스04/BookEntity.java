package com.study.java_study.ch09_클래스04;

// 정보 하나하나
public class BookEntity { // 정보 클래스
    private int bookId;
    private String bookName;
    private String author;
    private String publisher;

    // 매개변수 없는 기본 생성자
    public BookEntity() {
    }


    // 생성자 생성 Alt + insert
    public BookEntity(int bookId, String bookName, String author, String publisher) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    // Getter 와 Setter
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    // 정보 출력 메시지 toString
    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
