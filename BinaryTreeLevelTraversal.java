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
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList <ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList <TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList <Integer> temp = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i< size; i++){
                TreeNode current = queue.poll();
                temp.add(current.val);
                if (current.left != null){
                    queue.offer(current.left);
                }
                if (current.right != null){
                    queue.offer(current.right); 
                }
            }
            res.add(temp);
        }
        return res;
        
    }
    
}
