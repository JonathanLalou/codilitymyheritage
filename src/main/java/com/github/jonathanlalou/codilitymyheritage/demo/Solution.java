package com.github.jonathanlalou.codilitymyheritage.demo;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] input) {
        // write your code in Java SE 8
        Integer index;
        for (int i = 0; i < input.length; i++) {
            int current = input[i];
            final int sumBefore = sum(input, 0, i);
            final int sumAfter = sum(input, i + 1, input.length);
            System.out.println("\n index: " + i + "  ");
            System.out.printf(" sumBefore %d", sumBefore);
            System.out.printf(" sumAfter %d", sumAfter);
            if (sumBefore == sumAfter) {
                return i;
            }
        }
        return -1;
    }

    public int sum(int[] input, int from, int to) {
        Integer sum = 0;
        for (int i = from; i < to; i++) {
            int current = input[i];
            sum += current;
        }
        return sum;
    }
}