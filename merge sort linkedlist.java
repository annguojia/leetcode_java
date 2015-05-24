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
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
       
        ListNode dummpy = new ListNode(0);
        ListNode head = dummpy;
        
       
        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                dummpy.next = l1;
                dummpy = dummpy.next;
                l1 = l1.next;
            } else {
                dummpy.next = l2;
                dummpy = dummpy.next;
                l2 = l2.next;
            }
        }
        if (l1 == null){ 
            dummpy.next = l2;
            
        }else {
            dummpy.next = l1;
        }
        return head.next;
    }
}
