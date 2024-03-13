package com.baekjjon.goniffers.section03;

import java.util.Scanner;

public class App07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= T+1; i++){

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            result = num1 + num2;
            System.out.println("Case #"+ i +": " + result);

        }

    }

}
