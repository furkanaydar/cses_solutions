package com.furkanaydar;

import java.util.Scanner;

public class Main {

    static int N, S;
    static long[] arr = new long[200005];
    static long result;

    public static void bs(long start, long end) {
        if (start + 1 >= end) {
            return;
        }

        long mid = (start+end)/2;

        int subArrayCount = 1;
        long currentSumOfSubArray = 0;
        boolean possible = true;

        for (int i=0; i<N; i++) {
            if (arr[i] + currentSumOfSubArray > mid) {

                if (arr[i] > mid) {
                    possible = false;
                    break;
                }

                currentSumOfSubArray = arr[i];
                subArrayCount++;

                if (subArrayCount > S) {
                    possible = false;
                    break;
                }
            }
            else {
                currentSumOfSubArray += arr[i];
            }
        }

        if (possible) {
            result = mid;
            bs(start, mid);
        }

        else {
            bs(mid, end);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();
        long end = 0;

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextLong();
            end += arr[i];
        }

        result = end;
        bs(0, end);
        System.out.println(result);
    }
}
