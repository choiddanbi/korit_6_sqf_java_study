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


 public class StringUtils {
     boolean isEmpty(String str) {
         if (str == null) {
             return true;
         }
         return str.equals("");
     }
 }
