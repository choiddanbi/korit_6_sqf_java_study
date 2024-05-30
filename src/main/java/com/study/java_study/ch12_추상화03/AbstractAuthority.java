package com.study.java_study.ch12_추상화03;

// Authority 인터페이스를 가져와서 쓰겠다
public abstract class AbstractAuthority implements Authority {
    private String role;

    public AbstractAuthority() {
        role = DEFAULT_ROLE;
    }

    //생성자
    public AbstractAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
