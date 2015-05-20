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
        Stack<TreeNode> temp = new Stack<TreeNode>();
        
        if (root == null){
            return res;
        }
        
        TreeNode current=root;
    
        while(current!=null||!temp.empty()){
            while (current != null) {
                temp.push(current);
                current = current.left;
            }
            current = temp.pop();
            res.add(current.val);
            current =current.right;
        }
        
        return res;
        
    }
    
}
