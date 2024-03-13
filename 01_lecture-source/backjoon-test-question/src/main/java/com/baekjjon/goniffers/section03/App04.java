package com.baekjjon.goniffers.section03;

import java.util.Scanner;

public class App04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;

        for(int i = 0; i < N; i++){

            int price = sc.nextInt();
            int su = sc.nextInt();
            total += price * su;

        }
        if(X == total){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}
