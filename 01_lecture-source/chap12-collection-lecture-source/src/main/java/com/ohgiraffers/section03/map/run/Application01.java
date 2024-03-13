package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. Map 의 자료구조에 대해 이해하고 HashMap 을 이용할 수 있다.  */
        /* 필기.
        *   Map 인터페이스 특징
        *   Collection 인터페이스 와는 다른 저장방식을 가진다.
        *   키(key) 와 값(value) 를 하나의 쌍으로 저장하는 방식을 사용한다.
        *
        *  필기.
        *   키(key) 란?
        *   값(value) 를 찾기 위한 이름 역할을 하는 객체를 의미한다.
        *   1. 요소의 저장 순서를 유지하지 않는다.
        *   2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
        *
        *  필기.
        *   HashMap, HashTable, TreeMap 등이 대표적인 클래스이다.
        *   HashMap 이 가장 많이 쓰인다.
        *  */

        HashMap<Object, Object> hMap = new HashMap<>();

        // 가장 많이 쓰임
//        Map hmap2 = new HashMap<>();
//        List list = new ArrayList<>();

        /* 필기. 키와 값 쌍으로 저장한다.
        *       키와 값 둘 다 반드시 객체여야 한다.
        * */

        hMap.put("one", new Date());
        hMap.put(12,"red apple");
        hMap.put(33,123);
        // autoBoxing 처리됨 : 12 => new Integer(12)

        System.out.println("hMap = " + hMap);

        hMap.put(12, "fineapple");
        System.out.println("hMap = " + hMap);

        hMap.put(11,"fineapple");
        System.out.println("hMap = " + hMap);

        hMap.remove(11);
        System.out.println("hMap = " + hMap);

        System.out.println("키 12번에 대한 객체 : " + hMap.get(12));

        HashMap<String,String> hMap2 = new HashMap<>();
        hMap2.put("one","java");
        hMap2.put("two","mysql");
        hMap2.put("three","jdvc");
        hMap2.put("four","html");
        hMap2.put("five","css");

        System.out.println("hMap2 = " + hMap2);

    }

}
