package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 키보드로 값을 입력 받을라고 Scanner 이라는 클래스를 가져다 씀

        boolean isRun = true;

        System.out.println("프로그램 시작");

        while(isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램 종료");

            System.out.println("메뉴 선택 : ");
            String selectedMenu = scanner.nextLine(); // 키보드로 입력받을거야 !
            switch (selectedMenu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다.");
                    break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    boolean isRunMenu2 = true;
                    while (isRunMenu2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");

                        System.out.println("메뉴 선택 :");
                        selectedMenu = scanner.nextLine(); // 키보드로 입력 받고 싶을때마다 써주는거
                        switch (selectedMenu) { // 재사용 가능 롸...??
                            case "1":
                                System.out.println("회원 번호로 조회를 합니다.");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회를 합니다.");
                                break;
                            case "b": // 안쪽 case 도 멈추고 안쪽 while 이 멈추고 밖에 while 이 돌아 ~
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu2 = false;
                                break;
                            case "q": // 안쪽 while 과 밖에 while 모두 멈추니까........................ㅠㅠ
                                System.out.println("프로그램을 종료합니다.");
                                isRunMenu2 = false; // 안쪽 while 끝내기
                                isRun = false; // 안쪽 while 끝나야 밖에 while 실행된다, 밖에 while 끝내기
                                break; // 즉, 프로그램을 종료합니다. 프로그램 종료
                            default:
                                System.out.println("잘못된 입력입니다. 다시입력하세요");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false; // 반복문이 더이상 실행 안되고 "프로그램 종료" 가 나옴
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
            System.out.println(); // 그냥 줄바꿈
        }

        System.out.println("프로그램 종료");
    }
}
