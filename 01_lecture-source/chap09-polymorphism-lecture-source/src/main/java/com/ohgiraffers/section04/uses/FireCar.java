package com.ohgiraffers.section04.uses;

public class FireCar extends Car implements Soundable{


    @Override
    public void go() {
        System.out.println("소방차가 달려갑니다. ");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다. ");
    }

    @Override
    public void horn() {
        System.out.println("소방차가 지나갑니다~~~~~~~~~~~~~~~~~다들 비켜~~~~~~~~~~~~~~~~~````");
    }
}

/* 필기. 추상클래스 , 인터페이스(다중 상속도 가능!)는 강제화를 하기 위해서 */