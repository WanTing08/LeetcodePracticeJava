/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * */
public class Day3T206ReverseLinkedList {
    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Day3T206ReverseLinkedList obj = new Day3T206ReverseLinkedList();
        ListNode reversedHead = obj.reverseLinkedList(head);
        while(reversedHead != null){
            System.out.println(reversedHead.val + ' ');
            reversedHead = reversedHead.next;
        }
    }

}
