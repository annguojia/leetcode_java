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
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if (head == null){
            return null;
        }
        ListNode dummyleft = new ListNode(0);
        ListNode lefthead = dummyleft;
        ListNode dummyright = new ListNode(0);
        ListNode righthead = dummyright;
        ListNode pointer = head;
        while(pointer != null){
            if (pointer.val < x){
                dummyleft.next = pointer;
                dummyleft = dummyleft.next;
            }
            if (pointer.val >= x){
                dummyright.next = pointer;
                dummyright = dummyright.next;
                
            }
            pointer = pointer.next;
        }
        dummyleft.next = righthead.next;
        dummyright.next = null;
        return lefthead.next;
        
        
    }
}

