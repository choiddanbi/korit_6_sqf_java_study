package com.study.java_study.ch16_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class Message<T> {
    private T message;

}
