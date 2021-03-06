public class Solution {
    /**
     * @param candidates: A list of integers
     * @param target:An integer
     * @return: A list of lists of integers
     */
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        
        ArrayList<Integer> path = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates, target, path, 0, result);
        return result;
        
    } 
    
    public void helper(int[] candidates, int target, ArrayList<Integer> path, int start, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<Integer> (path));
            return;
            
        }    
        // int prev = -1;
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            if (i > 0 && candidates[i] == candidates[i - 1] ) {
                continue;
            }
            
            path.add(candidates[i]);
            helper(candidates, target - candidates[i], path, i, result);
            path.remove(path.size() - 1);

            // prev = candidates[i];
        }
    }
}
