package com.arindam.algo.functional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: arpaul on 5/2/19.
 */
public class SimpleMapReduce {
    public static Integer calculateSumOfDoubles(List<Integer> items) {
        if (items.isEmpty()) return 0;
        Integer sum = 0;
        List<Integer> doubles = items
                .stream()
                .map(item -> {
                    return item * 2;
                })
                .collect(Collectors.toList());
        sum = doubles.stream().reduce(0, (i, j) -> i + j);
        return sum;
    }
}
