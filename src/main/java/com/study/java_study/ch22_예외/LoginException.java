package com.study.java_study.ch22_예외;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// 내가 만든 예외!!
public class LoginException extends RuntimeException {
    private String username;

    // 예외 생성자 만들 떄 Ctrl + Insert 에서 message 있는 생성자 선택해서!!
    // 생성자
    public LoginException(String message, String username) {
        super(message);
        this.username = username;
    }

    // 일반메소드
    public String getErrorMessage() {
       return username + "사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다.";
    }
}
