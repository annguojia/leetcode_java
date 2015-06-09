public class Solution {
    /**
     * @param num: Given the candidate numbers
     * @param target: Given the target number
     * @return: All the combinations that sum to target
     */
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
        ArrayList<ArrayList<Integer>>  result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        if (num == null || num.length == 0) {
            return result;
        }
        Arrays.sort(num);
        helper(num, target, path, 0, result);
        return result;
    }
    
    public void helper(int[] num, int target, ArrayList<Integer> path, int index,
        ArrayList<ArrayList<Integer>>  result) {
            if (target == 0) {
                result.add(new ArrayList<Integer> (path));
                return;
            }
            if (target < 0) {
                return;
            }
        
            for (int i = index; i < num.length; i++) {
                //为什么这么的条件是 i > index???
                // 为什么这样就能保证 不重复取同一元素 但是可以取值相同 但是重复出现的元素
                // debug place if (i > 0 && num[i] == num[i - 1])
                if (i > index && num[i] == num[i - 1]) {
                    continue;
                }
                if (target < num[i]) {
                    break;
                }
                path.add(num[i]);
                helper(num, target - num[i], path, i + 1, result);
                path.remove(path.size() - 1);
            }
        }
}
