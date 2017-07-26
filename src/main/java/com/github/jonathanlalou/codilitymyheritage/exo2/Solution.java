package com.github.jonathanlalou.codilitymyheritage.exo2;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        return -1;
    }

    protected int max(int[] A, int from, int to) {
        int max = A[from];
        for (int i = from; i < to; i++){
            System.out.println("i, A[i] == " + i + " " + A[i]);
            if (A[i]>max){
                max = A[i];
            }
        }
        return max;
    }
}
