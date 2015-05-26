/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        // use a long time to debug 
        // No.1 need to calculate the length of the list
        // No.2 need to familiarize how to change pointer in list 
        if (head == null || head.next == null) {
            return head;
        }
        
        // what if k larger than the length of list;
        ListNode dummpy = new ListNode(0);
        ListNode slow = head;
        ListNode fast = head;
        ListNode p = head; 
        int sum = 0;
        while(p != null){
            p = p.next;
            sum = sum + 1;
        }
        if (k % sum == 0) {
            return head;
        }
        while (k % sum > 0){
            fast = fast.next;
            k--;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        dummpy.next = slow.next;
        fast.next = head;
        
        slow.next = null;
        // ListNode temp = slow;
        
        // fast.next = dummpy.next;
        // dummpy.next = fast;
        // temp.next = null;
        
        return dummpy.next;
        
    }
}
