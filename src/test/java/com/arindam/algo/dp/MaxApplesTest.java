package com.arindam.algo.dp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by arpaul on 9/14/14.
 */
public class MaxApplesTest {

    @Test
    public void testMaxApples() {
        MaxApples client = new MaxApples();
        int[][] input = new int[][]{
                {5, 1, 3, 4, 2},
                {0, 5, 2, 3, 1},
                {1, 3, 4, 8, 2},
                {1, 2, 1, 2, 9}
        };
        /*
          5 1 3 4 2
          0 5 2 3 1
          1 3 4 8 2
          1 2 1 2 9
         */

        System.out.println(client.findMaxFruit(input, 3,4));

    }

}
