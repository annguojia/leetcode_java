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
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if (root == null){
            return 0;
        }
        return getMin( root);
        
        
    }
    public int getMin(TreeNode root){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        //divide
        int left = getMin(root.left);
        int right = getMin(root.right);
        
        //conquer
        return Math.min(left, right) + 1;
    
    }
}
