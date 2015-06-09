class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.size() == 0) {
            return res;
        }
        Collections.sort(nums);
        ArrayList<Integer> path = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.size()];
        helper(nums, visited, path, res);
        return res;
        
    }
    public void helper(ArrayList<Integer> nums, boolean [] visited, ArrayList<Integer> path, 
        ArrayList<ArrayList<Integer>> res) {
        if (path.size() == nums.size()) {
            res.add(new ArrayList<Integer> (path));
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (visited[i] == true ||(i> 0 &&nums.get(i) == nums.get(i - 1) && visited[i -1] ==true)  ) {
                continue;
            }
            visited[i] = true;
            path.add(nums.get(i));
            helper(nums, visited, path, res);
            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }
}

