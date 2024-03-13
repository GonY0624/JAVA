package com.baekjjon.goniffers.section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 버퍼드리더, 버퍼드리더
public class App06 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = br.read();

        int result = 0;

        for(int i = 0; i < T; i++){

            int num1 = br.read();
            int num2 = br.read();
            result = num1 + num2;
            System.out.println(result);
        }

    }

}
