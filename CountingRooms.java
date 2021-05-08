// package com.furkanaydar;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int N, M;
    static char[][] arr = new char[1000][1000];
    static final int[][] dims = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean inArea(int x, int y) {
        return x>=0 && y>=0 && x<N && y<M;
    }

    static void dfs(int x, int  y) {
        Stack<Pair> q = new Stack<>();

        q.add(new Pair(x, y));

        while (!q.isEmpty()) {
            Pair cp = q.pop();
            int cx = cp.x;
            int cy = cp.y;
            arr[cx][cy] = '#';

            for (int k=0; k<4; k++) {
                int newX = cx + dims[k][0], newY = cy + dims[k][1];

                if (inArea(newX, newY) && arr[newX][newY] == '.') {
                    q.add(new Pair(newX, newY));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        String[] inp = new String[1000];


        N = sc.nextInt();
        M = sc.nextInt();

        for (int i=0; i<N; i++) {
            inp[i] = sc.next();

            for (int j=0; j<M; j++) {
                arr[i][j] = inp[i].charAt(j);
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (arr[i][j] == '.') {
                    result++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(result);
    }
}
