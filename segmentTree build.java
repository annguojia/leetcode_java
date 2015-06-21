/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end) {
 *         this.start = start, this.end = end;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     *@param start, end: Denote an segment / interval
     *@return: The root of Segment Tree
     */
    public SegmentTreeNode build(int start, int end) {
        // write your code here
        if (start > end) {
            return null;
        }
        // if (start == end) {
        //     SegmentTreeNode root = new SegmentTreeNode(start, end);
        //     root.max = start;
        //     return root;
        // }
        
        SegmentTreeNode root = new SegmentTreeNode(start, end);
        
        int mid = start + (end - start)/2;
        if (start != end) {
            root.left = build(start, mid);
            root.right = build(mid + 1, end);
            // root.max = Math.max(root.left.max, root.right.max);
        } else {
        //     root.max = start;
            root.left = null;
            root.right = null;
        }
        return root;
        // if (start <= mid) {
        //     if (start < mid) {
        //         root.left = build(start, mid);
        //         root.left.max = Math.max(leftmax, rightmax);
        //     } else {
        //         root.left = SegmentTreeNode(start, mid);
        //         root.left.max = start;
        //     } 
        // }
        // if (mid < end) {
        //     if (end = mid + 1){
        //         root.right = SegmentTreeNode(mid + 1, end);
        //         root.right.max = mid + 1;
        //     } else {
        //         root.right = build(mid + 1, end);
        //     }
        // }
        
        
    }
}
