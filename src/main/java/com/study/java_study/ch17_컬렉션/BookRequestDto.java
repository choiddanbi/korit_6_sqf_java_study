package com.study.java_study.ch17_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
// Data Transfer Object
// 데이터 전송 객체
public class BookRequestDto {
    private int status;
    private String message;
    private List<BookEntity> bookEntities;
}


