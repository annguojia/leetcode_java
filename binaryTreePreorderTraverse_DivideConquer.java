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
     * @return: Preorder in ArrayList which contains node values.
     */
    
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        // no recursion
        ArrayList<Integer> res = new ArrayList<Integer>();
        // Stack temp = new Stack();
        if (root == null) {
            return res;
            
        }
        //Divide
        ArrayList<Integer> left = preorderTraversal(root.left);
        ArrayList<Integer> right = preorderTraversal(root.right);
        //Conquer
        res.add(root.val);
        res.addAll(left);
        res.addAll(right);
        
        
        return res;
        
        
      
       
    }
    
   
}
