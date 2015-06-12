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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        // apply level traverse and reverse
        if (root == null) {
            return;
        }
        root = helper(root);
    }
    public TreeNode helper(TreeNode node) {
        if (node == null) {
            return node;
        }
        TreeNode right = helper(node.left);
        TreeNode left = helper(node.right);
        node.right =right;
        node.left = left;
        return node;
    }
}
