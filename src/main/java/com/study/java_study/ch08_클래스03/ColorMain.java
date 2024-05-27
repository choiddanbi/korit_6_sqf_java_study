package com.study.java_study.ch08_클래스03;

public class ColorMain {
    public static void main(String[] args) {
        /*
        문제
        Color 객체 5개를 담을 수 있는 배열 생성하여
        #CA848A, Brandied Apricot
        #FFBE98, Peach Fuzz
        #964F4C, Marsala
        #A78C7B, Almondine
        #D8C8BD, Almond peach 색상 데이터를 저장 한 후에

        for문을 사용하여 배열이 들어있는
        모든 색상 정보를 printInfo() 로 호출하여 출력한다.

        이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다.
        이때 null로 바꿀때에는 반복문을 사용한다.
         */

        // 이거
        Color[] colors = new Color[5]; // 배열 객체 생성 Color 를 가져다 쓰겠다
        colors[0] = new Color("#CA848A", "Brandied Apricot"); //String 이라서 ""
        colors[1] = new Color("#FFBE98", "Peach Fuzz");
        colors[2] = new Color("#964F4C", "Marsala");
        colors[3] = new Color("#A78C7B", "Almondine");
        colors[4] = new Color("#D8C8BD", "Almond peach");


        Color[] colors2 = new Color[]{
                new Color("#AAA" , "a"),
                new Color("#BBB", "b"),
                new Color("#CCC", "c"),
                new Color("#DDD", "d"),
                new Color("#EEE", "e"),
        };


         /* for (int i=0; i < colors.length; i++) {
            colors[i].printInfo();
            System.out.println();
        }*/

        // colors배열을 color 클래스 안에 있는 printInfo 를 해라
         for (Color color : colors) {
             color.printInfo();
             System.out.println();
         }

         for(Color color : colors) {
             color.setCode(null); // code 가 private 니까 set한테 부탁한거
             color.setName(null);
             color.printInfo();
             System.out.println();
         }

         for (Color color : colors2) {
             color.printInfo();
             System.out.println();
         }


        for(Color color : colors2) {
            color.setCode(null);
            color.setName(null);
            color.printInfo();
            System.out.println();
        }


        // 위에 '이거' 처럼 적어도 되는데 값이 많아지면 힘드니까,
        /* for (int i=0; i < colors.length; i++) {
            colors[i].setCode(null); // 입력
            colors[i].setName(null);
            colors[i].printInfo();
            System.out.println();
        }*/
    }
}

