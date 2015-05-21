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
        TreeNode temp = root;
        TreeNode tempParent = null;
        boolean isRight = true;
        while(temp != null){
            if (temp.val < node.val){
                tempParent = temp;
                if(temp.right == null){
                    tempParent.right = node;
                    return root;
                }else{
                    temp = tempParent.right;
                    }
                isRight = true;
            } else if (temp.val > node.val){
                tempParent = temp;
                if(temp.left == null){
                    tempParent.left = node;
                    return root;
                }else{
                    temp = tempParent.left;
                    }
                isRight = false;
            }
        }
        if (isRight){
            tempParent.right = node; 
        } else{
            tempParent.left = node;
        }
        return root;
        // //divide
        // TreeNode left = root.left;
        // TreeNode right = root.right;
        // TreeNode res;
        // //conquer
        // if (root.val < node.val){
        //     res.right = insertNode(right);
        //     res.left = root.left;
            
        // } else {
        //     res.left = insertNode(left);
        //     res.right = root.right;
            
        // }
        // return res;
        
        
    }
}
