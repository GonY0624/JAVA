package com.baekjjon.goniffers.section02;

import java.util.Scanner;

public class App01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        }else {
            System.out.println("==");
        }

    }

}
