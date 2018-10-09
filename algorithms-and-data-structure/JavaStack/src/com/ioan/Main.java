package com.ioan;

import  java.lang.StackOverflowError;

public class Main {

    public static void main(String[] args) throws Stack.StackOverflowException, Stack.StackUnderflowException {
	    Stack<Integer> stack = new Stack<>();

	    stack.push(1);
	    stack.push(3);
	    stack.push(5);

        System.out.println("Stack size: " + stack.getSize());
        System.out.println("Stack full?: " + stack.isFull());
        System.out.println("Stack empty?: " + stack.isEmpty());

        stack.push(4);
        System.out.println("Stack size: " + stack.getSize());
        System.out.println("Stack full?: " + stack.isFull());
        System.out.println("Stack empty?: " + stack.isEmpty());

        System.out.println("Stack peek: " + stack.peek());

        int data = stack.pop();
        System.out.println("Popped element: " + data);

        System.out.println("Peek again: " + stack.peek());

        try {
            stack.push(4);
            stack.push(5);
        } catch (Stack.StackOverflowException soe) {
            System.out.println("Stack is full! No room available.");
        }

        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Stack.StackUnderflowException sue) {
            System.out.println("Stack is empty! No elements available.");
        }

        // MINIMUM STACK
        System.out.println("==============");
        System.out.println("Minimum Stack");
        System.out.println("==============");

        StackMinimumInConstantTime stackMinimumInConstantTime = new StackMinimumInConstantTime();
        stackMinimumInConstantTime.push(2);
        stackMinimumInConstantTime.push(4);
        stackMinimumInConstantTime.push(10);

        System.out.println("Minimum so far is: " + stackMinimumInConstantTime.getMinimum());
        stackMinimumInConstantTime.push(1);
        System.out.println("Minimum so far is: " + stackMinimumInConstantTime.getMinimum());
        stackMinimumInConstantTime.push(0);
        System.out.println("Minimum so far is: " + stackMinimumInConstantTime.getMinimum());

        stackMinimumInConstantTime.pop();
        System.out.println("Minimum so far is: " + stackMinimumInConstantTime.getMinimum());
        stackMinimumInConstantTime.pop();
        System.out.println("Minimum so far is: " + stackMinimumInConstantTime.getMinimum());
        stackMinimumInConstantTime.pop();
        System.out.println("Minimum so far is: " + stackMinimumInConstantTime.getMinimum());
    }
}
