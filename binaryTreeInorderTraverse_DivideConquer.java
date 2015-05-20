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
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        //recursion
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null){
            return res;
        }
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        left = inorderTraversal(root.left);
        right = inorderTraversal(root.right);
        res.addAll(left);
        res.add(root.val);
        res.addAll(right);
        
        return res;
        
    }
    
}
