// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] prices = new int[1005];
        int[] pages = new int[1005];
        int[][] dp = new int[1005][100005];

        int N = sc.nextInt(), P = sc.nextInt();

        for (int i=0; i<N; i++) {
            prices[i] = sc.nextInt();
        }

        for (int i=0; i<N; i++) {
            pages[i] = sc.nextInt();
        }

        for (int i=0; i<P; i++) {
            dp[0][i] = i >= prices[0] ? pages[0] : 0;
        }

        for (int i=1; i<=N; i++) {
            for (int j=0; j<=P; j++) {

                dp[i][j] = dp[i-1][j];

                if (j>=prices[i]) {
                    dp[i][j] = Math.max(dp[i-1][j-prices[i]] + pages[i], dp[i][j]);
                }

            }
        }

        int maxi = 0;
        for (int i=0 ; i<=P; i++) {
            maxi = Math.max(maxi, dp[N][i]);
        }

        System.out.println(maxi);
    }
}
