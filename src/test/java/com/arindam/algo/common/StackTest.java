package com.arindam.algo.common;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: arpaul on 9/18/18.
 */
public class StackTest {

    public Stack<String> stack;

    @Before
    public void setUp() {
        stack = new Stack<String>(100);
        stack.push("Hello");
        stack.push("World");
    }

    @Test
    public void popShouldWork() {
        Assert.assertFalse("Stack should not be empty!",stack.empty());
        Assert.assertThat("Pop should work", stack.pop(), is("World"));
        Assert.assertThat("Pop should work", stack.pop(), is("Hello"));
    }
}
