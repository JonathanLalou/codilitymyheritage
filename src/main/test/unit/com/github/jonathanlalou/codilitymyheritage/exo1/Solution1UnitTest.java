package com.github.jonathanlalou.codilitymyheritage.exo1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1UnitTest {
    private Solution solution = new Solution();
    private int[] A = {10, 2, 5, 1, 8, 20};
    private int[] B_noTriangle = {10, 20, 30};
    private int[] C = {5, 10, 18, 7, 8, 3};


    @Test
    public void solution() throws Exception {
//        assertEquals(23, solution.solution(A));
//        assertEquals(25, solution.solution(C));
        assertEquals(-1, solution.solution(B_noTriangle));
    }

    @Test
    public void isTriangle() throws Exception {
    }

    @Test
    public void perimeter() throws Exception {
    }

}