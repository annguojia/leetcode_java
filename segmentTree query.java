/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, max;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int max) {
 *         this.start = start;
 *         this.end = end;
 *         this.max = max
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     *@param root, start, end: The root of segment tree and 
     *                         an segment / interval
     *@return: The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
        if (start == root.start && end == root.end) {
            return root.max;
        }
        // if (start > root.end || end < root.start) {
        //     return Integer.MIN_VALUE;
        // }
        int mid = root.start + (root.end - root.start)/2;//debug
        int leftmost = Integer.MIN_VALUE;
        int rightmost = Integer.MIN_VALUE;
        // left subtree
        if (start <= mid) {
            if (mid < end) {
                leftmost = query(root.left, start, mid);
            } else {
                leftmost = query(root.left, start, end);
            }
        }
        // right subtree 
        if (end >= mid + 1) {
            if (start < mid + 1) {
                rightmost = query(root.right, mid + 1, end);
            } else {
                rightmost = query(root.right, start, end);
            }
        }
        return Math.max(leftmost, rightmost);
    }
}
