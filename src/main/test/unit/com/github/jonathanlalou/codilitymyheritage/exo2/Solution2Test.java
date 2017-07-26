package com.github.jonathanlalou.codilitymyheritage.exo2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {
    private Solution solution = new Solution();

    @Test
    public void solution2(){

    }

    @Test
    public void max(){
        final int[] A = {1, 15, 65, 12, 5, 6, 8, 7, 9, 77, 5, 99, 5, 10, 5, 66};
        assertEquals(65, solution.max(A, 0, 6));
        assertEquals(99, solution.max(A, 3, 13));
    }

}