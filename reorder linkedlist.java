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
     * @return: void
     */
    public void reorderList(ListNode head) {  
        // write your code here
        if (head == null || head.next == null) {
            return ;
        }
        ListNode mid = findmid(head);
        ListNode right = reverse(mid.next);
        mid.next = null;
        mergeList(head, right);
        
    }
    public ListNode findmid(ListNode head) {
        //不在需要if 判断为空，因为主函数里面会判断
        ListNode slow = head;
        ListNode fast = head.next;
        // debug: while loop  && 还是 ||
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummpy = null;
        
        while(head != null){
            //debug 在linkedlist插入 删除操作顺序 不熟练
           
            ListNode temp = head.next;
            
            head.next = dummpy;
            dummpy = head;
            head = temp;
        }
        return dummpy;
    }
    public void mergeList (ListNode left, ListNode right) {
        ListNode dummpy = new ListNode(0);
        ListNode dummpyHead = dummpy;
        int count = 1;
        while (left != null &&  right != null) {
            if (count % 2 != 0){
                dummpy.next = left;
                dummpy = dummpy.next;
                left = left.next;
            }else {
                dummpy.next = right;
                dummpy = dummpy.next;
                right = right.next;
            }
            count ++;
            
        }
        if (right != null ) {
            dummpy.next = right;
        }
        if (left != null) {
            dummpy.next = left;
        }
        
        
        
    }
}

