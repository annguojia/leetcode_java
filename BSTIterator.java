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
 * Example of iterate a tree:
 * Solution iterator = new Solution(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */
public class Solution {
    //@param root: The root of binary tree.
    private Stack<TreeNode> stack = new Stack<>();
    private TreeNode curt;
    public Solution(TreeNode root) {
        curt = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        return (curt != null || !stack.isEmpty());
    }
    
    //@return: return next node
    public TreeNode next() {
        while (curt != null) {
            stack.push(curt);
            curt = curt.left;
        }
        
        curt = stack.pop();
        TreeNode node = curt;
        curt = curt.right;
        
        return node;
    }
    // public Solution(TreeNode root) {
    //     // write your code here
    //     if (root == null){
    //         return;
    //     }
    //     if (hasNext()){
    //         Solution(root.left);
            
    //     }
    //     TreeNode next = next();
    //     if (hasNext()){
    //         Solution(root.right);
            
    //     }
    // }

    // //@return: True if there has next node, or false
    // public boolean hasNext() {
    //     if root
    //     // write your code here
    // }
    
    // //@return: return next node
    // public TreeNode next() {
    //     TreesNode res = root.val;
    //     return res;
    //     // write your code here
    // }
}
