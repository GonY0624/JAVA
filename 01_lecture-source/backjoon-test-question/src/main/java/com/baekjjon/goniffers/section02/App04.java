package com.baekjjon.goniffers.section02;

import java.util.Scanner;

public class App04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M < 45){
            H= H-1;
            M = 60 + (M-45);
            if(H < 0){
                H = 23;
            }
            System.out.println(H +" "+ M);
        } else if (M>45) {
            System.out.println(H + " " + (M-45));
        }

    }

}
