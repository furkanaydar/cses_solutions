// package com.furkanaydar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int mx = 1;

        for (int i=1; i<inp.length(); i++) {
            int cur = 1;

            while (i<inp.length() && inp.charAt(i) == inp.charAt(i-1)) {
                i++;
                cur++;
                mx = Math.max(mx, cur);
            }
        }

        System.out.println(mx);
    }
}
