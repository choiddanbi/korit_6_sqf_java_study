package com.study.java_study.ch06_배열;

import java.util.Scanner;

// 배열의 공간 늘리거나 줄이는 방법 => 이사
public class ArrayService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;
        // 등록 > 전체조회 > 이름찾기 > 수정 > 삭제
        while (isRun) {
            System.out.println("[학생관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectedManu = scanner.nextLine();

            switch (selectedManu) {
                case "1":
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1]; // 기본보다 배열의 크기가 +1인 배열을 만든다
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i]; // 기존 배열값들을 새로운 배열로 이사 !!
                    }
                    names = newNames; // 기존의 names로 새로운 newNames 주소 다시 옮기기 !!
                    // 왜냐면 위에서 다 names 쓰고있는데 갑자기 newnames 쓰면 못알아들으니까..?
                    // newNames = null; // newNames 는 이제 필요없으니까 비워주기
                    System.out.print("등록 할 이름:");
                    names[names.length - 1] = scanner.nextLine(); // 새로운 배열 마지막 인덱스에 값 넣기
                    System.out.println("등록 완료!");
                    break;

                case "2": // 이름 중복이 있을 경우 맨 앞의 애를 수정
                    System.out.println("[이름 수정]");
                    System.out.println("수정 하고 싶은 이름: ");
                    String before = scanner.nextLine();

                    boolean check = false;
                    for (int i = 0; i < names.length; i++) {
                        if (before.equals(names[i])) {
                            System.out.println("변경 후 이름: ");
                            String after = scanner.nextLine();
                            names[i] = after;
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        System.out.println("이름이 수정되었습니다.");
                    } else {
                        System.out.println("등록되지 않은 이름입니다.");
                    }

                    break;

                case "3": // 이름 중복이 있을 경우 맨 앞의 애를 삭제
                    System.out.println("[이름 삭제]");
                    System.out.println("삭제 할 이름을 입력하세요: ");
                    String delete = scanner.nextLine();

                    check = false;

                    String[] Delete_Name = new String[names.length - 1];
                    int x = 0;

                    for (int i = 0; i < names.length ; i++) {
                        if (delete.equals(names[i])) { // 입력값 중 name 에 일치하는 값이 있을때
                            System.out.println("이름을 삭제합니다.");
                            if (delete != names[i]) { // 입력값이 name 에 없는 애들을 Delete_Name 으로 이사한다
                                Delete_Name[x] = names[i];
                                names = Delete_Name;
                                x++;
                                check = true;
                                break;
                            }
                        }
                    }

                        if (check) {
                            System.out.println("이름이 삭제되었습니다.");
                        } else {
                            System.out.println("등록되지 않은 이름입니다.");
                        }

                        break;


                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String result = null;
                    String findName = scanner.nextLine();

                    for (String name : names) {
                        if (name.equals(findName)) { // ??
                            result = name;
                            break;
                        }
                    }
                    if (result == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i=0; i<names.length; i++) {
                        System.out.println("index[" + i + "]= " + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
            System.out.println();
        }

    }

}
