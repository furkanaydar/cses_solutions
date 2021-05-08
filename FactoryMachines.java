// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    static int N;
    static int T;
    static long[] arr = new long[200005];
    static long ans = Long.MAX_VALUE;

    static void bs(long start, long end) {
        long mid = (start + end)/2;
        long sum = 0;


        if (start+1 == end) {
            ans = Math.min(ans, end);
            return;
        }
        for (int i=0; i<N; i++) {
            sum += mid/arr[i];
            
            if (sum > T) {
                break;
            }
        }

        if (sum >= T) {
            ans = Math.min(ans, mid);
            bs(start, mid);
        }

        else {
            bs(mid, end);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        T = sc.nextInt();

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        bs(0L, 1000000000000000000L);
        System.out.println(ans);

    }
}
