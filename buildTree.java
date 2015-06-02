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
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public int findPosition(int[] inorder, int instart, int inend, int root) {
        for (int i = instart; i <= inend;  i++) {
            if (inorder[i] == root) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if (preorder == null || inorder == null) {
            return null;
        }
        if (preorder.length != inorder.length) {//debug place == -> !=
            return null;
        }
        int prestart = 0;
        int preend = preorder.length - 1;
        
        int instart = 0;
        int inend = inorder.length - 1;
        
        return helperBuildTree(preorder, prestart, preend, inorder, instart, inend);
        
    }
    public TreeNode helperBuildTree(int[] preorder, int prestart, int preend, 
                                int[] inorder, int instart, int inend) {
        if (instart > inend) {
            return null; // debug add this 判断条件？？？为什么？？？
        }                          
        TreeNode root = new TreeNode(preorder[prestart]);
        int position = findPosition(inorder, instart, inend, preorder[prestart]);
        TreeNode left = helperBuildTree(preorder, prestart + 1, prestart + position - instart, inorder, instart, position - 1);
        TreeNode right = helperBuildTree(preorder, position - inend + preend + 1, preend, inorder, position + 1, inend);
        root.left = left;
        root.right =right;
        return root;
    }
}
