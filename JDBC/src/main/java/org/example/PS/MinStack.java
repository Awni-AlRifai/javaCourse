package org.example.PS;

import java.util.Iterator;
import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Integer minimum;
    public MinStack() {
        this.stack = new Stack<Integer>();
        this.minimum = 0;
    }

    public void push(int val) {
        if(this.stack.empty())this.minimum = val;
        this.stack.push(val);
        if(val < this.minimum)this.minimum = val;
    }

    public void pop() {
        if((int)this.stack.peek() == (int)this.minimum){
            stack.pop();
            Iterator value = this.stack.iterator();
            int min = Integer.MAX_VALUE;
            while(value.hasNext()){
                min = Math.min((int)value.next(),min);
            }
            this.minimum = min;
        } else stack.pop();
    }

    public int top() {
        return (int)this.stack.peek();
    }

    public int getMin() {
        return this.minimum;
    }
}

