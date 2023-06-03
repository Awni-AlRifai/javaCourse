package org.example.PS;

public class Main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(512);
        stack.push(-1024);
        stack.push(-1024);
        stack.push(512);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());


    }
}
