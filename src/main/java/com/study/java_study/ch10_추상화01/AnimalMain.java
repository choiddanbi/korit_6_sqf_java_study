package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈"); // 객체 생성 >> Animal 객체 생성 + Dog 객체도 생성됨 // Animal 이 엄마니가 !
        Animal tiger = new Tiger("웅이", 5, 100);

        // Animal tiger = new Tiger("웅이", 5, 100); // 업캐스팅 : 자식 -> 부모
        // Animal : 자료형
        // tiger : 변수명
        // Tiger() : 객체

        dog.move();
        tiger.move();
        // tiger.hunt(); >> Animail 로 업캐스팅 되어있어서 hunt 못씀
        ((Tiger)tiger).hunt(); // tiger 객체의 자료형을 Tiger로 다운캐스팅 해서 hunt 써줘야함
        dog.bark();

        /* 결과
        강아지가 움직입니다. >> Animal 의 move() // dog.move();
        호랑이가 네발로 뛰어갑니다. >> Tiger의 move(); // tiger.move();
        동물이 움직입니다. >> Animal 의 move() // tiger.move();
        호랑이가 100의 힘으로 사냥을 합니다. // ((Tiger)tiger).hunt();
         */

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("웅이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();

        // 타이거가 ( 업ㅇ캐스팅 )애니멀이 된 적이 있어야 타이거로 다운캐스팅ㅇ 가능
        for(Animal animal : animals) {
            if(animal instanceof Tiger) { // 찍어낸 것 : 인스턴스 즉, animal 은 Tiger 의 인스턴스다! >> Tiger의 원래 자료형이 뭐였니 ??
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if (animal instanceof Dog) {
                Dog d = (Dog) animal; // 다운캐스팅
                d.bark();
            }
        }


        // instanceof 대신 쓰는 방법 >> 이거 써야행 ~
        // .getClass() : 자료형 확인 메서드
        for(Animal animal : animals) {
            if(animal.getClass() == Tiger.class) { // Tiger의 원래 자료형이 뭔지 확인 > animal[] 배열의 자료형 과 Tiger 객체의 자료형이 같다면 ~
                Tiger t = (Tiger) animal; // animal[] 배열의 자료형을 Tiger 로 바꿔라 !
                t.hunt();
            } else if (animal.getClass() == Dog.class) { // Dog 원래 자료형이 뭔지 확인
                Dog d = (Dog) animal; // 다운캐스팅
                d.bark();
            }
        }
    }
}

        // animals 이라는 배열 생성 > 자료형은 Animal[]
        // 원래는 Tiger 에 Animal 못넣음 >> 추상화를 했기 때문에 아래들이 가능한거얌
       /* Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Tiger(); // 업캐스팅
        animals[2] = new Dog(); //

        System.out.println(dog.toString()); // super toSting 안해준거 >> breed 만 나옴
        System.out.println(tiger.toString()); // super toString 해준거 >> age, name, power*/

        /*
        **** 업캐스팅 된 것 들만 다운캐스팅 가능!! ****
        다운캐스팅 : 부모 -> 자식으로 형변환
        업캐스팅 : 자식 -> 부모로 형변환

        // 1. 가능
        Animal a2 = new Tiger(); // 업캐스팅(묵시적) Tiger() 클래스는 Animal 자료형을 쓰겠다
        Tiger t2 = (Tiger) a2; // 다운캐스팅 > 다시 Tiger 자료형사용

        // 2. 이건 안됨 > Animal 메모리가 더 작은데 Tiger 를 구겨넣을수가 없음!!
        Animal a = new Animal();
        Tiger t = (Tiger)a; // 다운캐스팅? X

        // 3. 이거도 안됨 >> Dog 랑 Tiger 는 다른거니까
        Animal a = new Dog(); // 업캐스팅??
        Tiger t = (Tiger)a; // Tiger로 다시 돌림

        // 추상화 사용 이유 : 공통된 것들만 ㅅㅏ용하기 위해?
         + 프로그램에 이미 만들어져있는 거를ㄹ 가져와서 우리가 메소드를 수정해서 다시 쓸 경우 ??_객체만 수정하면 됨

         객체지향언어 = 절차지향언어에 객체가 추가된 것 !
        */

// 객체 형변환은 주소가 바뀌는건 아님 ( 리터럴 형변환은 주소가 바뀜 )!!
// 단, 이거는 Tiger클래스의 power변수는 못씀
