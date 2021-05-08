// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[1000000];

        for (int i=0; i<10; i++) {
            dp[i] = 1;
        }

        for (int i=10; i<=N; i++) {
            int n = i;
            int min =  Integer.MAX_VALUE;

            while (n > 0) {
                int c = n%10;

                if (c != 0) {
                    min = Math.min(dp[i-c], min);
                }

                n /= 10;
            }

            dp[i] = min + 1;
        }

        System.out.println(dp[N]);
    }
}
