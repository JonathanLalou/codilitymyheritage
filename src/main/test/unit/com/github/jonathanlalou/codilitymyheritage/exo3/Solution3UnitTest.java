package com.github.jonathanlalou.codilitymyheritage.exo3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3UnitTest {
    private Solution solution = new Solution();

    @Test
    public void solution_1() throws Exception {
        int[] A = new int[]{1, 3, 2, 1};
        int[] B = new int[]{4, 2, 5, 3, 2};
        assertEquals(2, solution.solution(A, B));
    }

    @Test
    public void solution_2() throws Exception {
        int[] A = new int[]{2, 1};
        int[] B = new int[]{3, 3};
        assertEquals(-1, solution.solution(A, B));
    }

}