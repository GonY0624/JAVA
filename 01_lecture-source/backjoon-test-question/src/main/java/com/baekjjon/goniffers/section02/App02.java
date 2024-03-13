package com.baekjjon.goniffers.section02;

import java.util.Scanner;

public class App02 {

    public static void main(String[] args) {

//        System.out.print("안녕 :");
        Scanner sc = new Scanner(System.in);
        long year = sc.nextLong();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("1");
        } else{
            System.out.println("0");

        }

    }

}
