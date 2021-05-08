// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N, S;
        int[] arr = new int[105];
        int[] dp = new int[2000005];
        final int modulo = 1000000007;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            dp[arr[i]] = 1;
        }

        for (int i=0; i<=S; i++) {
            if (dp[i] > 0) {
                for (int j=0; j<N; j++) {
                    int k = arr[j];
                    dp[i+k] = (dp[i+k] + (dp[i] % modulo)) % modulo;
                }
            }

        }

        System.out.println(dp[S]);
    }
}