package com.github.jonathanlalou.codilitymyheritage.exo1;

public class Solution {
    public int solution(int[] A) {
        int max = -1;
        for (int p = 0; p < A.length - 2; p++) {
            for (int q = p + 1; q < A.length - 1; q++) {
                for (int r = q + 1; r < A.length; r++) {
                    if (isTriangle(A, p, q, r)) {
                        int perimeter = perimeter(A, p, q, r);
//                        System.out.println("p, q, r, perimeter: " + p + " " + q + " " + r + " " + perimeter);
                        if (perimeter > max) {
                            max = perimeter;
                        }
                    }
                }
            }
        }
        return max;
    }

    public boolean isTriangle(int[] A, int p, int q, int r) {
        return (0 <= p) && (p < q) && (q < r) && (r < A.length)
                && ((A[p] + A[q]) > A[r])
                && ((A[q] + A[r]) > A[p])
                && ((A[r] + A[p]) > A[q]);
    }

    public int perimeter(int[] A, int p, int q, int r) {
        return A[p] + A[q] + A[r];
    }
}
