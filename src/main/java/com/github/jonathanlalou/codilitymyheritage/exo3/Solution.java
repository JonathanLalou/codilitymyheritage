package com.github.jonathanlalou.codilitymyheritage.exo3;

import java.util.Arrays;

public class Solution {
    int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i] || A[k] == B[i+1])
                return A[k];
        }
        return -1;
    }
}
