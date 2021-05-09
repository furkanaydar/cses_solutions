// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        long sum = 0;

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=1; i<N; i++) {
            int diff = arr[i-1] - arr[i];
            if (diff > 0) {
                sum += diff;
                arr[i] = arr[i-1];
            }
        }

        System.out.println(sum);
    }
}
