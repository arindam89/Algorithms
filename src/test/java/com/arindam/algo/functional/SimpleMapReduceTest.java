package com.arindam.algo.functional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author: arpaul on 5/2/19.
 */
public class SimpleMapReduceTest {
    @Test
    public void testSumOfDoubles() {
        List<Integer> nums = Arrays.asList(3,4,5,6);
        assertThat("Sum is equal to 36", SimpleMapReduce.calculateSumOfDoubles(nums), is(36));
    }
}
