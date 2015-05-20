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
        //recurison 这个是迭代法 难点在怎么将结果append到arraylist中去
        //新创建的函数 返回值为空 如果将结果保存下来， 于是想到了每次调用时 把res 现有的值传入
        ArrayList<Integer> res = new ArrayList<Integer>();
        traverse(root, res);
        return res;
       
    }
    
    public void traverse(TreeNode root, ArrayList<Integer> res){
        if (root == null) {
            return;//也是一个需要学习、消化的地方
        }
        res.add(root.val);
        traverse(root.left, res);
        traverse(root.right, res);
        
        
        
    }
}
