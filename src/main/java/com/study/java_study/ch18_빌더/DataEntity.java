package com.study.java_study.ch18_빌더;

public class DataEntity {
    private String data1;
    private int data2;
    private double data3;
    private String data4;

    // 매개변수 생성자
    public DataEntity(String data1, int data2, double data3, String data4) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }


    // DataEntityBuilder 로 리턴받는 builder 메소드
    public static DataEntityBuilder builder() {
        return new DataEntityBuilder(); // DataEntityBuilder 가 static이라 바로 호출 가능!
    }

    // 내부클래스 : DataEntityBuilder
    public static class DataEntityBuilder {
        private String data1;
        private int data2;
        private double data3;
        private String data4;

        // build메소드 생성
        public DataEntity build() {
            return new DataEntity(data1, data2, data3, data4);
        }

        // data1 메소드생성
        public DataEntityBuilder data1(String data1) {
            this.data1 = data1;
            return this;
        }

        // data2 메소드생성 >
        public DataEntityBuilder data2(int data2) {
            this.data2 = data2;
            return this;
        }

        // data3 메소드생성 >
        public DataEntityBuilder data3(double data3) {
            this.data3 = data3;
            return this;
        }

        // data4 메소드생성 >
        public DataEntityBuilder data4(String data4) {
            this.data4 = data4;
            return this;
        }

    }
}
