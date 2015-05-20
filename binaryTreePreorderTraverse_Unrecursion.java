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
        Stack <TreeNode>temp = new Stack<TreeNode>();
        if (root == null) {
            return res;
            
        }
        temp.push(root);
        //res.add(root.val)
        //temp.push(root.right)
        //temp.push(root.left)
        
        
        while(!temp.empty()){
            TreeNode A = temp.pop();
            res.add(A.val);
            if(A.right!=null)temp.push(A.right);
            if(A.left!=null)temp.push(A.left);
        }
        
        return res;
        
        
      
       
    }
    
   
}
