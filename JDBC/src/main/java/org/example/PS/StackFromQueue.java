package org.example.PS;

import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueue {
    private Queue<Integer> queue1 = new LinkedList<>();

    public void push(int x){
        queue1.add(x);
        for(int i = 1; i < queue1.size(); i++) {
            queue1.add(queue1.remove());
        }
    }

    public void pop(){
        if(this.empty())
            return;
        // you can return if the queue is empty or just use queue.poll
        queue1.remove();
    }
    public int top(){
        return queue1.peek();
    }
    public boolean empty(){
        return queue1.isEmpty();
    }



}
