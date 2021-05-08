// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[][] arr = new char[1000][1000];
        int[][] dp = new int[1000][1000];
        final int modulo = 1000000007;

        for (int i=0; i<N; i++) {
            String ln = sc.next();

            for (int j=0; j<N; j++) {
                arr[i][j] = ln.charAt(j);
            }
        }

        dp[0][0] = arr[0][0] == '*' ? 0 : 1;

        for (int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {

                if (arr[i][j] == '*') {
                    continue;
                }

                if (i>=1 && arr[i-1][j] != '*') {
                    dp[i][j] = ((dp[i][j] % modulo) + dp[i-1][j]) % modulo;
                }

                if (j>=1 && arr[i][j-1] != '*') {
                    dp[i][j] = ((dp[i][j] % modulo) + dp[i][j-1]) % modulo;
                }
            }
        }

        System.out.println(dp[N-1][N-1]);
    }
}
