# [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)

## Solution

In this solution, we use two pointers 'head' and 'curr'. We start by
moving all leading elements with value 'val' by moving the 'head' 
pointer to the next non-value element.

Then we use 'curr' pointer to traverse the remaining list, removing
any elements with value 'val'. The time complexity of this solution is **O(n)**, 
where n is the number of nodes in the linked list.

### [code](../src/main/java/day1_5/Day3T203RemoveLinkedListElements.java)

```java
public class day1_5.Day3T203RemoveLinkedListElements {
    public  static datastructure.ListNode removeElements(datastructure.ListNode head, int val){
        while (head != null && head.val == val) { // remove all leading elements with value val
            head = head.next;
        }
        datastructure.ListNode curr = head;
        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
```


# [707. Design Linked List](https://leetcode.com/problems/design-linked-list/)

### [code](../src/main/java/day1_5/Day3T707MyLinkedList.java)

```java
class day1_5.Day3T707MyLinkedList {
    private datastructure.ListNode head;
    private int size;
    private class datastructure.ListNode{
        int val;
        datastructure.ListNode next;
        public datastructure.ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /** Initialize your data structure here. */
    public day1_5.Day3T707MyLinkedList(){
        head = null;
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        datastructure.ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        datastructure.ListNode newNode = new datastructure.ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
        } else {
            datastructure.ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new datastructure.ListNode(val);
            size++;
        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            datastructure.ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            datastructure.ListNode newNode = new datastructure.ListNode(val);
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            datastructure.ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}
```

# [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)

## Solution
We start by defining two 'datastructure.ListNode' variable 'prev' and 'curr', 'prev'
will eventually point to the head of the reversed linked list, the
'curr' initially point to the head of the input linked list.

We enter a 'while' loop that runs as long as 'curr' is not 'null'. 
Inside the loop, we define a third 'datastructure.ListNode' variable 'temp', which
point to the 'curr's next node. We do this because we'll be modifying 'curr.next' in the next line, and we don't want to lose our reference to 'curr's original next node.

We set 'curr.next' to 'prev'. This effectively reverses the direction of 'curr's pointer, so that it now points to the previous node in the linked list (which is initially null).


We then update 'prev' to point to 'curr', and 'curr' to point to 'temp'. This moves our "pointer" down the linked list by one node.
Once the 'while' loop terminates, 'prev' will be pointing to the head of the reversed linked list. We return it.




### [code](../src/main/java/day1_5/Day3T206ReverseLinkedList.java)
```java
public datastructure.ListNode reverseList(datastructure.ListNode head) {
    datastructure.ListNode prev = null;
    datastructure.ListNode curr = head;
    while (curr != null) {
        datastructure.ListNode Temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = Temp;
    }
    return prev;
}

```



