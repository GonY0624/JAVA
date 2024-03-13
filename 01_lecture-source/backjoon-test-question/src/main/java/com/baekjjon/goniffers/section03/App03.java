package com.baekjjon.goniffers.section03;

import java.util.Scanner;

public class App03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int N = sc.nextInt();
        for(int i = 0; i <= N; i++){
        sum += i;
        }
        System.out.println(sum);

    }

}
