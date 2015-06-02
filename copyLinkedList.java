/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if (head == null ) {
            return  head;
        }
        // copy node 
        RandomListNode tail = head;
        while(head != null) {
            RandomListNode temp = head.next;
            RandomListNode copy = new RandomListNode(head.label);
            copy.next = head.next;
            head.next = copy;
           
            head = temp;
        }
        
        head = tail;
        //copy random 
        while (head != null && head.next != null ) {
            if (head.random != null) // debug place
                head.next.random = head.random.next;
            head = head.next.next;
        }
        
        //break original and copy
        head = tail.next;
        while (head != null && head.next != null) {
            head.next = head.next.next;
            head = head.next;
        }
        
        return tail.next;
    }
}
