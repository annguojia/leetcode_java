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
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null){
            return null;

        }
        ListNode dummpy = new ListNode(0);
        dummpy.next = null;
        while(head!=null){
            //写循环的时候还是感觉有点儿困难 要克服
            
            ListNode temp1 = dummpy.next;
            ListNode temp2 = head.next;
            dummpy.next = head;
            dummpy.next.next = temp1;
            head = temp2;
            
        }
        return dummpy.next;

    }
}

