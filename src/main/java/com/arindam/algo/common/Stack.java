package com.arindam.algo.common;

/**
 * Sample application of Stack
 * @author: arpaul on 9/18/18.
 */
public class Stack<T> {
    private T[] stack;
    private int top;

    public Stack(final int size) {
        stack = (T[]) new Object[size];
        top = -1;
    }

    public Boolean empty() {
        if(top == -1) return true;
        return false;
    }

    public T peek() {
        // Handle the edge cases
        return stack[top];
    }

    public boolean push(final T value) {
        top = top + 1;
        stack[top] = value;
        return true;
    }

    public T pop() {
        if(top > -1) {
            T temp = peek();
            top = top - 1;
            return temp;
        }
        return null;
    }

}
