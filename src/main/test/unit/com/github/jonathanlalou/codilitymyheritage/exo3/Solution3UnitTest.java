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

    @Test
    public void solution_3() throws Exception {
        int[] A = new int[]{1, 2, 5, 6, 7, 19};
        int[] B = new int[]{19, 32, 45};
        assertEquals(19, solution.solution(A, B));
    }

    @Test
    public void solution_4() throws Exception {
        int[] A = new int[]{1, 2, 5, 6, 7, 19};
        int[] B = new int[]{1, 2};
        assertEquals(1, solution.solution(A, B));
    }

    @Test
    public void solution_4_2() throws Exception {
        int[] A = new int[]{1, 2, 5, 6, 7, 19};
        int[] B = new int[]{1, 2, 5, 6, 7, 19};
        assertEquals(1, solution.solution(A, B));
    }

    @Test
    public void solution_4_3() throws Exception {
        int[] A = new int[]{2, 2, 5, 6, 7, 19};
        int[] B = new int[]{1, 1, 1, 2, 7, 19};
        assertEquals(2, solution.solution(A, B));
    }

    @Test
    public void solution_4_4() throws Exception {
        int[] A = new int[]{2, 2, 5, 6};
        int[] B = new int[]{1, 1, 1, 2};
        assertEquals(2, solution.solution(A, B));
    }

    @Test
    public void solution_4_5() throws Exception {
        int[] A = new int[]{2, 5, 6};
        int[] B = new int[]{1, 1, 2};
        assertEquals(2, solution.solution(A, B));
    }

    @Test
    public void solution_5() throws Exception {
        int[] A = new int[]{1};
        int[] B = new int[]{32, 18, 1, 2};
        assertEquals(1, solution.solution(A, B));
    }

    @Test
    public void solution_6() throws Exception {
        int[] A = new int[]{1, 18};
        int[] B = new int[]{1, 18};
        assertEquals(1, solution.solution(A, B));
    }

}