package com.study.java_study.ch21_스트림;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Phone {
    private Integer number;
    private String model;
}
