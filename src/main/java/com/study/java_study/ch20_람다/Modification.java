package com.study.java_study.ch20_람다;

/*
    람다 (Lambda) 의 사용 조건
     1. '하나의 추상메소드'를 정의 하고 있는 '인터페이스'에서 사용한다. > 람다식에서는 이름 정의를 안해줘서 추상메소드가 두개면 뭘 가져와야하는지 모름
     2. 매개변수의 타입을 생략 할 수 있다
     3. 매개변수가 하나이면 매개변수를 감싸는 () 괄호를 생략 할 수 있다.
     4. 다른 명령 없이 바로 리턴'만' 한다면,
        메소드를 정의하는 {} 중괄호와 return 키워드를 같이 생략 할 수 있다.
     */

@FunctionalInterface
// 인터페이스
public interface Modification <T> {
    // 추상메소드
    T modify(T oldData, T newData);
}
