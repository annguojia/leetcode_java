/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null){
            return true;
        }
        
        int  left = helper(root.left);
        int  right = helper(root.right);
        // conquer
        if (left == Integer.MAX_VALUE || right == Integer.MAX_VALUE){
            return false;
        }
        else 
            return Math.abs(left - right) < 2 ? true :false;
        
    }
    public int helper(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        int res = Math.abs(left - right);
        if (res >1) 
            return Integer.MAX_VALUE;
        else 
            return Math.max(left, right) + 1;
    }
    
}
