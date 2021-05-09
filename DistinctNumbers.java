// package com.furkanaydar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        StringTokenizer st
                = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Map<Integer, Boolean> hash = new HashMap<>();
        int cnt = 0;

        String line;

        while ( (line = br.readLine()) != null ) {
            st = new StringTokenizer(line);

            while (st.hasMoreTokens()) {
                int x = Integer.parseInt(st.nextToken());

                if (hash.get(x) == null) {
                    cnt++;
                    hash.put(x, true);
                }
            }
        }

        System.out.println(cnt);

    }
}
