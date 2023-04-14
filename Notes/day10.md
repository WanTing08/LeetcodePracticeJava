# [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)
## Solution
The 'MyQueue' class implements a queue using two stacks: 'stackIn' and
'stackOut'. When we need to add an element to the queue, we simply push
it into 'stackIn'. When we need to move an element from the queue, we 
first move all elements 'stackIn' to 'stackOut' so that the first element
pushed into the queue is now at the top of 'stackOut', We then pop the
element from 'stackOut'.

```java
class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        stackIn = new Stack<>(); // 负责进栈
        stackOut = new Stack<>(); // 负责出栈
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop(){
        peek();
        return stackOut.pop();
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
```

# [225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)

## Solution

```java
class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue2.offer(x);
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> queueTemp;
        queueTemp = queue1;
        queue1 = queue2;
        queue2 = queueTemp;
    }
    
    public int pop() {
        return queue1.poll();
    }
    
    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
```
