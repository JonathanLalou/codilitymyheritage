package com.github.jonathanlalou.codilitymyheritage.exo2;

public class Solution {
    public int solution(int[] A) {
        final int[] diffs = new int[A.length];

        for (int j = 0; j < A.length; j++) {
            final int maxLeft = max(A, 0, j);
            final int maxRight = max(A, j, A.length);
//            System.out.printf("\n j :%d, maxLeft: %d, maxRight: %d", j, maxLeft, maxRight);
            diffs[j] = Math.abs(maxLeft - maxRight);
        }


        return max(diffs, 0, A.length);
    }

    protected int max(int[] A, int from, int to) {
        int max = A[from];
        for (int i = from; i < to; i++) {
//            System.out.println("i, A[i] == " + i + " " + A[i]);
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
}
