/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if (head == null || head.next == null) {
            return null;
        }
        ListNode dummpy = new ListNode(0);
        dummpy.next = head;
        ListNode slow = dummpy;
        ListNode fast = dummpy;
        while (n > 0) {
            fast = fast.next;
            n = n - 1;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummpy.next;
        
        
    }
}

