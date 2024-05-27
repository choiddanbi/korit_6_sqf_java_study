package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0]; // books 라는 배열 생성

        BookArrayUtils bookArrayUtils = new BookArrayUtils(); // 함수 호출

        boolean isRun = true;

        while (isRun) {
            System.out.println("[1. 도서 입력]");
            System.out.println("[2. 도서 수정]");
            System.out.println("[3. 도서 삭제]");
            System.out.println("[4. 전체 조회]");
            System.out.println("[q. 프로그램 종료]");
            System.out.print("메뉴 선택: ");

            String selectedMenu = scanner.nextLine();
            String[] newBooks = null;
            int findIndex = -1; // ???

            switch (selectedMenu) {
                case "1":
                    System.out.println("1. 도서 입력");
                    newBooks = new String[books.length + 1] ; // 이사를 위해 newBooks 배열 생성
                    for (int i=0; i < books.length; i++) {
                        newBooks[i] = books[i];
                    }
                    books = newBooks;
                    System.out.println("도서명을 입력하세요 : ");
                    books[books.length -1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;


                case "2":
                    System.out.println("2. 도서 수정");
                    System.out.println("수정 할 이름 : ");
                    String modifyName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(books, modifyName);

                    if (findIndex == -1) {
                        System.out.println("존재하지 않는 도서명입니다.");
                        break;
                    }
                    System.out.println("새 이름 : ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료 !");
                    break;

                case "3":
                    System.out.println("3. 도서 삭제");
                    System.out.println("삭제 할 도서명 : ");
                    String removeName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(books, removeName);

                    if (findIndex == -1) {
                        System.out.println("존재하지 않는 도서명입니다.");
                        break;
                    }
                    newBooks = new String[books.length -1]; // books 보다 1자리 작은 newBooks라는 배열 생성
                    for (int i = 0; i < newBooks.length; i++) { // books.le 가 아닌 newbooks.le 인 이유 : newbooks 에 값을 넣고 있으니가 ..?
                        if(i < findIndex) {
                            newBooks[i] = books[i];
                            continue;
                        }
                        newBooks[i] = books[i + 1];
                    }
                    books = newBooks;
                    System.out.println(removeName + "을(를) 삭제하였습니다.");
                    break;

                case "4":
                    System.out.println("전체 조회");
                    for (int i=0; i< books.length; i++) {
                        System.out.println("index [" + i + "] =" +books[i]);
                    }
                    break;

                case "q":
                    isRun = false;
                    break;

                default:
                    System.out.println("다시 입력하세요");
            }
            System.out.println();
        }
    }
    }



