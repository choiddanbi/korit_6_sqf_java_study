package com.study.java_study.ch18_빌더;

// 빌더패턴 : 필요한 데이터만 설정할 때 사용!

import org.w3c.dom.ls.LSOutput;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("a", 18, 18.5, "b"); // all생성자로 대입
        // 근데 data1과 data3 값만 넣고싶음 > 방법3가지 !!
        // 방법1) All 생성자로 > 빈 곳에 0 or null 값 넣어주기
        // Data data = new Data("a", 0, 18.5, null);
        // 방법2) 아무것도 없는 생성자 만들어서 필요한거에 하나씩 넣기 @No생성자 만들어서 Setter이용
        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(3.14);
        // 방법3) 생성자 오버로딩 > 단, String이 두개라서 못함!!

        // 생성 DataEntity dataEntity = new DataEntity();
        DataEntity dataEntity = DataEntity.builder()
                .data2(10)
                .data1("a")
                .data4("b")
                .build(); // 이렇게 생성도 가능 ㅠㅠ
        // DataEntity.builder() 는 static 메소드이다 > dataentitybuilder() 객체
        // DataEntity.builder().data1("a") 이 또 다시 DataEntity.builder()의 주소
        // DataEntity.builder().data1("a").data2(10) 도 DataEntity.builder()의 주소
        // DataEntity.builder().data1("a").data2(10).data4("b").build() 는 DataEntity(data1, data2, data3, data4);

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(20)
                .data3(3.14)
                .data4("b")
                .build();
    }

}
