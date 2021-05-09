// package com.furkanaydar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st
                = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long s = a+b, d = s/3;

            if (s%3 != 0 || d>a || d>b) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
