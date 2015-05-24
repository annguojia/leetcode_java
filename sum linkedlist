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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null) {
            return l2;
            
        }
            
        if (l2 == null) {
            return l1;
            
        }
        
        ListNode dummpy = new ListNode(0);
        ListNode head = dummpy;
        while(l1 != null && l2 != null){
           
            dummpy.next = new ListNode(l1.val + l2.val);
            dummpy = dummpy.next;
            l1 = l1.next;
            l2 = l2.next;
            
        }
        if (l1 !=null && l2 == null){
            dummpy.next = l1;
            
        } else if (l2 != null && l1 == null ){
            dummpy.next = l2;
        } 
        ListNode p = head.next;
        while( p.next!= null){
            if (p.val > 9){
                p.next.val = p.next.val + p.val / 10;
                p.val = p.val % 10;
                
            }
            p = p.next;
            
        }
        if (p.val > 9) {
            // debug point 赋值的顺序不能改变
            p.next = new ListNode(p.val/10);
            p.val = p.val % 10;
           
        }
        return head.next;
        
        
    }
}
