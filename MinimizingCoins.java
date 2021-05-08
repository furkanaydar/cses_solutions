// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N, S;
        int[] arr = new int[105];
        int[] dp = new int[2000005];
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();

        for (int i=0; i<=S; i++) {
            dp[i] = -1;
        }

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            dp[arr[i]] = 1;
        }

        for (int i=0; i<=S; i++) {
            if (dp[i] != -1) {
                for (int j=0; j<N; j++) {
                    int v = arr[j];

                    if (dp[i+v] == -1) {
                        dp[i+v] = dp[i] + 1;
                    }

                    else {
                        dp[i+v] = Math.min(dp[i+v], dp[i] + 1);
                    }
                }
            }
        }

        System.out.println(dp[S]);
    }
}
