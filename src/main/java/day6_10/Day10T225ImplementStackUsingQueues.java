package day6_10;

import java.util.LinkedList;
import java.util.Queue;

/*
    Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

    Implement the MyStack class:

    void push(int x) Pushes element x to the top of the stack.
    int pop() Removes the element on the top of the stack and returns it.
    int top() Returns the element on the top of the stack.
    boolean empty() Returns true if the stack is empty, false otherwise.
 */
public class Day10T225ImplementStackUsingQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public Day10T225ImplementStackUsingQueues(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x){
        queue2.offer(x);
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
            Queue<Integer> temp;
            temp = queue1;
            queue1 = queue2;
            temp = queue2;
        }
    }

    public int pop(){
        return queue1.poll();
    }

    public int top(){
        return queue1.peek();
    }

    public boolean empty(){
        return queue1.isEmpty();
    }
}
