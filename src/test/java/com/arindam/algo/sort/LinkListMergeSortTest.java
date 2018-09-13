package com.arindam.algo.sort;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


/**
 * @author: arpaul on 9/13/18.
 */
public class LinkListMergeSortTest {
    List list1 = new LinkedList();
    List list2 = new LinkedList();
    List result = new LinkedList();
    List processed = new LinkedList();

    @Before
    public void setUp() {
        list1.addAll(Arrays.asList(2, 4, 6));
        list2.addAll(Arrays.asList(1, 3, 5));
    }

    @Test
    public void doSort() {
        processed = LinkListMergeSort.sort(list1, list2);
        assertThat("Merge sort of linked list should work", result, is(equalTo(processed)));

    }

}
