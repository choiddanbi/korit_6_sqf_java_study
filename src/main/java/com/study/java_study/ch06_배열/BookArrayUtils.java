package com.study.java_study.ch06_배열;

public class BookArrayUtils {
    int findIndexByName(String[] books, String book) { // books 라는 배열에서 book 을 찾겠다, book 은 내가 키보드로 친 값
        for (int i = 0; i < books.length; i++ ) {
            if (books[i].equals(book)) {
            // if (book.equals(books[i])) {
                return i;
            }
        }
        return -1;
    }
}
