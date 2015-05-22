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
     * @return: An integer.
     */

    public int maxPathSum(TreeNode root) {
        // write your code here
        //这个题对我来说难度很大 我到现在还是没有想清楚内里的逻辑 整个人非常的晕 
        //貌似这个题 经常被考到 我一定要加油 把这个题搞定
        int []max = new int[1];
        max[0] = Integer.MIN_VALUE;
        int temp = helper(root, max);
        return max[0];
        
    }
    public int helper(TreeNode root, int[] max){
        if (root == null) {
            return 0;
        }
        int left = helper(root.left, max);
        int right = helper(root.right, max);
        // int max = Integer.MIN_VALUE;
        int current = Math.max(root.val, 
            Math.max(left + root.val, right + root.val));
        max[0] = Math.max(max[0], Math.max(current, root.val + left + right)) ;
        return current;
        
    }
    
}
