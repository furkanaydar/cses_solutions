// package com.furkanaydar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        List<Long> res = new ArrayList<>();

        while (t != 1) {
            res.add(t);

            if (t%2 == 1) {
                t = 3*t+1;
            }

            else {
                t = t/2;
            }
        }

        for (Long re : res) {
            System.out.print(re + " ");
        }

        System.out.println(1);
    }
}
