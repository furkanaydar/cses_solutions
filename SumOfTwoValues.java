// package com.furkanaydar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class RichVal implements Comparable<RichVal> {
        int val;
        int index;

        public RichVal(int val, int index) {
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(RichVal o) {
            return this.val - o.val ;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st
                = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        if (N < 2) {
            System.out.println("IMPOSSIBLE");
            return;
        }

        List<RichVal> l = new ArrayList<>();
        int ii = 1;

        for (String line = br.readLine(); line != null; line = br.readLine()) {
            st = new StringTokenizer(line);

            while(st.hasMoreTokens()) {
                l.add(new RichVal(Integer.parseInt(st.nextToken()), ii++));
            }
        }

        Collections.sort(l);
        int lp = 0;
        int rp = N-1;
        while (lp < rp) {
            int sum = l.get(lp).val + l.get(rp).val;
            if (sum < X) {
                lp++;
            }
            else if (sum > X) {
                rp--;
            }
            else {
                List<Integer> res = new ArrayList<>();
                res.add(l.get(lp).index);
                res.add(l.get(rp).index);
                Collections.sort(res);
                System.out.println(res.get(0) + " " + res.get(1));
                return;
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}