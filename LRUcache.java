public class Solution {

    // @param capacity, an integer
    // private class DoubleLinkedListNode(int key, int value) {
    private class DoubleLinkedListNode{
        DoubleLinkedListNode pre;
        DoubleLinkedListNode next;
        int key;
        int value;
        
        public DoubleLinkedListNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.pre = null;
            this.next = null;
        }
    }
    
    private int capacity;
    // head 和 end 两个是空指针，里面的值为-1，-1；
    private DoubleLinkedListNode head = new DoubleLinkedListNode(-1, -1);
    private DoubleLinkedListNode end = new DoubleLinkedListNode(-1, -1);
    private HashMap<Integer,DoubleLinkedListNode> map = new HashMap<Integer, DoubleLinkedListNode>();
    
    public Solution(int capacity) {
        // write your code here
        this.head.next = this.end;
        this.end.pre = this.head;
        this.capacity = capacity;
    }

    // @return an integer
    public int get(int key) {
        if (map.containsKey(key)) {
            // delete current
            DoubleLinkedListNode temp = map.get(key);
            temp.pre.next = temp.next;
            temp.next.pre = temp.pre;
            // change to the end
            move_to_end(temp);
            
            return temp.value;
        } else {
            return -1;
        }
        // write your code here
    }

    // @param key, an integer
    // @param value, an integer
    // @return nothing
    public void set(int key, int value) {
        // write your code here
        if( get(key) != -1) {
            map.get(key).value = value;
            return;
        }

        if (map.size() == capacity) {
            map.remove(head.next.key);
            head.next = head.next.next;
            head.next.pre = head;
        }

        DoubleLinkedListNode insert = new DoubleLinkedListNode(key, value);
        map.put(key, insert);
        move_to_end(insert);
    }
    
    public void move_to_end(DoubleLinkedListNode current) {
        //难点： move_to_end 函数
        current.pre = this.end.pre;
        this.end.pre = current;
        current.pre.next = current;
        current.next = this.end;
        
    }
}
