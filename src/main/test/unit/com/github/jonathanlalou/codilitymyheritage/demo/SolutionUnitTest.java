package com.github.jonathanlalou.codilitymyheritage.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionUnitTest {
    final Solution solution = new Solution();

    @Test
    public void testSolution() {
        final int[] input = new int[]{
                -1,
                3,
                4,
                5,
                1,
                6,
                2,
                1,
        };
        assertEquals(1, solution.solution(input));
    }

}