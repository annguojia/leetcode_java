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
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list,
                    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {  
        // write your code here
        //可以采用insertion sort 和 quick sort
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = findmid(head);
        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);
        ListNode res = mergeList(left, right);
        return res;
        
        
    }

    public ListNode findmid(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next !=null){
            // debug 位置 是在 while判断
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
        
    }
    public ListNode mergeList(ListNode left, ListNode right) {
        if (left == null){
            return right;
        }
        if (right == null){
            return left;
        }
        ListNode dummpy = new ListNode(0);
        ListNode dummpyHead = dummpy;
        while (left != null && right != null){
            if (left.val < right.val ){
                dummpy.next = left;
                dummpy = dummpy.next;
                left = left.next;
            }else {
                dummpy.next = right;
                dummpy = dummpy.next;
                right = right.next;
                
            }
        }
        if (right != null) {
            dummpy.next = right;
        }
        if (left != null) {
            dummpy.next =left;
        }
        return dummpyHead.next;
        
        
    }
}

