package com.github.jonathanlalou.codilitymyheritage.exo2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2UnitTest {
    private Solution solution = new Solution();

    @Test
    public void solution2() {
        assertEquals(6, solution.solution(new int[]{1, 3, -3}));
        assertEquals(4, solution.solution(new int[]{4, 3, 2, 5, 1, 1}));
        assertEquals(15, solution.solution(new int[]{6, -9}));
        assertEquals(50, solution.solution(new int[]{6, -9, 18, 9, 9, 12, -32}));
    }

    @Test
    public void max() {
        final int[] A = {1, 15, 65, 12, 5, 6, 8, 7, 9, 77, 5, 99, 5, 10, 5, 66};
        assertEquals(65, solution.max(A, 0, 6));
        assertEquals(99, solution.max(A, 3, 13));
    }

}