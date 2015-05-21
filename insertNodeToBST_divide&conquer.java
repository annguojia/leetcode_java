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
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
            return node;
            
        }
        
        //divide
        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode res = root;
        //conquer
        if (root.val < node.val){
            res.right = insertNode(right, node);
            res.left = root.left;
            
        } else {
            res.left = insertNode(left, node);
            res.right = root.right;
            
        }
        return res;
        
        
    }
}
