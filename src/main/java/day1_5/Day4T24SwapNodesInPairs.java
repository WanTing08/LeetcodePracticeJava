package day1_5;

import datastructure.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without
 * modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 * */
public class Day4T24SwapNodesInPairs {
    public static ListNode swapNodes(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newHead = head.next;
        head.next = swapNodes(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        System.out.println("Original linked list:");
        printList(head);

        // Swap every two adjacent nodes in the linked list
        head = swapNodes(head);

        // Print the modified linked list
        System.out.println("Modified linked list:");
        printList(head);
    }

    // Helper method to print a linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
