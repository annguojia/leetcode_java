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
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        //recursion
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null){
            return res;
        }
        traverse(root, res);
        return res;
        //当我尝试使用stack时失败了 need to understand again
        // Stack<TreeNode> stack = new Stack<TreeNode>();
        // stack.push(root);
        // while(!stack.isEmpty()){
        //     TreeNode current = stack.pop();
        //     if (current.right != null){
        //         stack.push(current.right);
        //     }
        //     if (current.left != null){
        //         stack.push(current.left);
        //     }
        //     if (current != root){
        //         res.add(current.val);
        //     }

        // }
        // res.add(root.val);
        // return res;
        
    }
    public void traverse(TreeNode root, ArrayList<Integer> res){
        if (root == null){
            return;
        }
        traverse(root.left, res);
        traverse(root.right, res);
        res.add(root.val);
        
    }
    
}
