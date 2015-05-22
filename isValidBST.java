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
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        // 问题存在于如何 保证比node keys 小;最后参考了水中的鱼的答案
        // 对于每一个子树，限制它的最大，最小值，如果超过则返回false。
        // 对于根节点，最大最小都不限制；
        // 每一层节点，左子树限制最大值小于根，右子树最小值大于根；
        // 但是比较有趣的是，在递归的过程中还得不断带入祖父节点的值。
        // 或者，中序遍历该树，然后扫描一遍看是否递增。
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
        
    }
    private boolean helper(TreeNode root, long min, long max){
        if (root == null) {
            return true;
        }
        //我的错误原因 
        // if (root.val > min && root.val < max 
        //     && helper(root.left, Integer.MIN_VALUE, root.val)
        //     && helper(root.right, root.val, Integer.MAX_VALUE) ){
        //         return true;
        // }
        if (root.val > min && root.val < max 
            && helper(root.left, min , root.val)
            && helper(root.right, root.val, max) ){
                return true;
        }
        else {
            return false;
        }
        
    }
    
}
