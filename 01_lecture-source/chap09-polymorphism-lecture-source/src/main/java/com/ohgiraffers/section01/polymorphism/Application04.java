package com.ohgiraffers.section01.polymorphism;

public class Application04 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용해서 리턴 타입에 활용할 수 있다. */

        /* 목차. 랜덤동물() 메소드 추가 */

        /* 목차. 1. 랜덤동물() 호출 */
        Application04 app04 = new Application04();

        동물 randomAnimals = app04.랜덤동물();

        randomAnimals.울기();

    }

    public 동물 랜덤동물(){

        int 랜덤 = (int) (Math.random() * 2) + 0; //2는 범위 숫자를 2개 쓸 것이다, 초기값은 0은 생략 가능

        return 랜덤 == 0 ? new 토끼() : new 호랑이();

    }

}