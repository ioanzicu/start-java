package com.ioan;

public class StackMinimumInConstantTime {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minimumStack = new Stack<>();

    public void push(int data) throws
            Stack.StackOverflowException,
            Stack.StackUnderflowException {
        int min = data;
        if(!minimumStack.isEmpty()) {
            if (min > minimumStack.peek()) {
                min = minimumStack.peek();
            }
        }
        stack.push(data);
        minimumStack.push(min);
    }

    public int pop() throws Stack.StackUnderflowException {
        minimumStack.pop();
        return stack.pop();
    }

    public int getMinimum() throws Stack.StackUnderflowException {
        return minimumStack.peek();
    }
}
