package com.study.java_study.ch06_배열;

public class ArrayUtils {

    // 찾기, 수정, 삭제 => 모두 위치를 찾아야 하는데 그걸 함수로 빼버림
    int findIndexByName(String[] names, String name) { // names 배열에서 name 을 찾는다.
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1; // 해당 이름이 없습니다.
    }
}
