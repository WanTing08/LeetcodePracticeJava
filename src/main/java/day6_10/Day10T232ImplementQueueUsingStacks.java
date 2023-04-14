package day6_10;

import java.util.Stack;

/*
    Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the
    functions of a normal queue (push, peek, pop, and empty).

    Implement the MyQueue class:

    void push(int x)   Pushes element x to the back of the queue.
    int pop()          Removes the element from the front of the queue and returns it.
    int peek()         Returns the element at the front of the queue.
    boolean empty()    Returns true if the queue is empty, false otherwise.
 */
public class Day10T232ImplementQueueUsingStacks {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    /** Initialize your data structure here. */
    public Day10T232ImplementQueueUsingStacks(){
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    /** Push element x to the back of queue. */
    public void push(int x){
        stackIn.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop(){
        peek();
        return stackIn.pop();
    }
    /** Get the front element. */
    public int peek(){
        if(stackOut.empty()){
            while(!stackIn.empty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }
    /** Returns whether the queue is empty. */
    public boolean empty(){
        return stackIn.empty() && stackOut.empty();
    }
}
