// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        boolean[] hash = new boolean[N+1];

        for (int i=0; i<N-1; i++) {
            arr[i] = sc.nextInt();
            hash[arr[i]] = true;
        }

        for (int i=1; i<=N; i++) {
            if (!hash[i]) {
                System.out.println(i);
            }
        }
    }
}
