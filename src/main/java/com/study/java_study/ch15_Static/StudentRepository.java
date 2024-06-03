package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    // 스텍틱 변수
    private static StudentRepository instance; // instance 변수 (인스턴스) 생성

    // 생성자
    private StudentRepository() {
        names = new String[5];
    }

    // static메소드 getInstance()
    // static메소드는 static 변수를 바로 가져다 쓸 수 있음

    // 스택틱 메소드 : 스택틱 Getter
    // instance 가 null 이 아니면 자기자신으로 돌아간다.
    // 여기에 주소 만들어놓구 여기저기서 가져다 씀
    public static StudentRepository getInstance() {
        // StudentService studentService = new StudentService(); >> static 변수가 아니었다면, 원래는 이걸 해줘야함
        if(instance == null) {
            instance = new StudentRepository(); // 얘는 가능 > StudentRepository 는 private 이지ㅣ만 같은 클래스안이니까, StudentRepository()의 주소 넣ㅣ기
        } // StudentRepository() 객체 생성!
        return instance;
    }

    // 메소드
    public void add(String name) {
        for(int i=0; i<names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}
