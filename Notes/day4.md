# [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

## Solution

This code implements a **recursive** solution that swaps each pair of
adjacent node in the linked list. 

If the linked list is empty or has only one node, the function
returns the head of the list without modifying it. 

Otherwise, the function recursively swap pairs of nodes
starting from the second node and returns the new head of the modified 
list. 

The code use a temporary variable _'newHead'_ to keep track of
the new head of the list after the first pair is swapped.

### [code](../src/main/java/Day4T24SwapNodesInPairs.java)

```java
public ListNode swapNodes(ListNode head){
    if(head == null || head.next == null) return head;
    ListNode newHead = head.next;
    head.next = swapNodes(newHead.next);
    newHead.next = head;
    return newHead;
}
```

# [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

## Solution
We can use **two pointers** to solve this problem. The _'fast'_ pointer
moves **'n + 1'** steps first, and then the _'slow'_ pointer moves together
with _'fast'_ pointer until the _'fast'_ pointer reaches the end of the
list. 

Then we can remove the 'n'th node by updating the 'next' pointer 
of the 'n - 1'th node to skip over the 'nth' node.

We use a **dummy node** to handle the edge case where the first node needs to be removed.

Overall, the time complexity of this solution is _**O(n)**_, where n is the length of the linked list.

### [code](../src/main/java/Day4T19RemoveNthNodeFromEndOfList.java)

```java
public static ListNode removeNode(ListNode head, int n){
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode slow = dummy;
    
    for(int i = 1; i <= n + 1; i++){
        fast = fast.next;
    }
    
    while(fast != null){
        fast = fast.next;
        slow = slow.next;
    }
    
    slow.next = slow.next.next;
    return dummy.next;
}
```


# [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## Solution
We create a **dummy node** at the beginning of the result linked list to
make it easier to handle the case where the sum of the two input 
linked lists has an additional carry digit.

We initialize a variable _'carry'_ to 0, and then loop through both
linked lists, adding corresponding digits along with carry from the previous
digit. We update the carry variable based on the sum, and create a new
node with the least significant digit of the sum. We then move to next
digit in each linked list and continue until reach the end of both
linked lists.

If there is a carry digit in the end of addition, we create new node
for it and append it to the result linked list.

### [code](../src/main/java/Day4T2AddTwoNumbers.java)
```java
public ListNode addTwo(ListNode l1, ListNode l2){
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    int carry = 0;

    while(l1 != null || l2 != null){
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;
        
        int sum = x + y + carry;
        carry = sum / 10;
        current.next = new ListNode(sum % 10);
        current = current.next;
        
        if(l1 != null) l1 = l1.next;
        if(l2 != null) l2 = l2.next;
    }
    if(carry > 0){
        current.next = new ListNode(carry);
    }
    return dummy.next;
}
```



# [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/)

## Solution


### [code](../src/main/java/Day4T7ReverseInteger.java)


# [142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)

## Solution
The idea of the solution is to use two pointers, one slow and one fast, 
to traverse the linked list. If the fast pointer ever catches up the slow
pointer, then there must be a cycle in the list.


Once we know there is a cycle, we can find the node where the cycle
starts by setting one pointer to the head of the linked list and another
node where the fast and slow pointers meet. Then we move both pointers 
one step at a time until they meet again. The node where they meet is the start
of the cycle.

If there is no cycle in the list, then we simply return null.

### [code](../src/main/java/Day4T142LinkedListCycleII.java)
```java
public static ListNode detectCycle(ListNode head){
    if(head == null || head.next == null) return null;
    ListNode slow = head;
    ListNode fast = head;
    boolean hasCycle = false;
    
    while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            hasCycle = true;
            break;
        }
    }
    if(!hasCycle) return null;
    
    ListNode p1 = head;
    ListNode p2 = slow;
    while(p1 != p2){
        p1 = p1.next;
        p2 = p2.next;
    }
    return p1;
}
```





















