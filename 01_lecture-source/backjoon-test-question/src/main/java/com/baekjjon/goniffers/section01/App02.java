package com.baekjjon.goniffers.section01;

import java.util.Scanner;

public class App02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        System.out.println((first+second)%third);
        System.out.println(((first%third)+(second%third))%third);
        System.out.println((first*second)%third);
        System.out.println(((first%third)*(second%third))%third);


    }

}
