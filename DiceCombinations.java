// package com.furkanaydar;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int N;
        int[] dp = new int[1000005];
        final int MODULO = 1000000007;

	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();

	    dp[0] = 1;
	    dp[1] = 1;

	    for (int i=1; i<=N; i++) {

	        int sum = 0;

	        for (int j=1; j<=6 && i-j>=0 ; j++) {
	            sum = (sum + dp[i-j]) % MODULO;
            }

	        dp[i] = sum;
        }

	    System.out.println(dp[N]);
    }
}
