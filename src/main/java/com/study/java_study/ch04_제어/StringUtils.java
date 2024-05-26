package com.study.java_study.ch04_제어;

/*
public class StringUtils {

 boolean isEmpty(String str) {
        return str == null || str.equals("");
        // || 이거나,, == 주소값비교 , equals 값비교
        // name이면 name의 주소는 null이 아니고 name의 값은 ""가 맞다 ! 그러니까 true
        // text이면 text의 주소는 null이 아니고 text의 값은 ""가 맞다 ! 근데 return 때문에 프린트 안됨
    }
}*/


// str의 주소가 null 이면 true 를 return하고
// str의 주소가 null 이 아니면 str의 값이 "" 인가 비교해서 공백이면 true 를 리턴 (boolean) 해서 main 문으로
 public class StringUtils {
     boolean isEmpty(String str) {
         if (str == null) {
             return true;
         }
         return str.equals("");
     }
 }
