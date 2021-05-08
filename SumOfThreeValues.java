// package com.furkanaydar;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt(), X = sc.nextInt();

	    if (N < 3) {
	        System.out.println("IMPOSSIBLE");
	        return;
        }

	    List<RichVal> l = new ArrayList<>();

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            l.add(new RichVal(x, i+1));
        }

        Collections.sort(l);

        for (int i=0; i<N-2; i++) {
            int lp = i+1;
            int rp = N-1;
            while (lp < rp) {
                int sum = l.get(i).val + l.get(lp).val + l.get(rp).val;
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
                    res.add(l.get(i).index);
                    Collections.sort(res);
                    System.out.println(res.get(0) + " " + res.get(1) + " " + res.get(2));
                    return;
                }
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}
