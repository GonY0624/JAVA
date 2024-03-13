package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;

public class Application02 {

    public static void main(String[] args) {

        // 가볍게
        // 전 어플리케이션과 똑같은데 순서만 유지한다 정도만 알기

        /* 수업목표. LinkedHashSet 에 대해 이해하고 사용할 수 있다. */
        /* 필기.
        *   LinkedHashSet 클래스
        *   추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        *  */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("고은");
        lhset.add("용남");
        lhset.add("하은");
        lhset.add("규원");
        lhset.add("수연");

        System.out.println("lhset = " + lhset);


    }

}
