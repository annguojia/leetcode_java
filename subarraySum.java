public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i]; 
        }
        for (int j = 1; j < sum.length; j++) {
            if (sum[j] == 0) {
                res.add(0);
                res.add(j - 1);
                return res;
            }
        }
        
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for (int j = 1; j < sum.length; j++) {
            if (!map.containsKey(sum[j])) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(j - 1);
                map.put(sum[j],temp);
            } else {
                map.get(sum[j]).add(j - 1);
            }
        }
        for (int k = 1; k < sum.length; k++) {
            if (map.get(sum[k]).size() > 1) {
                // res.addAll(map.get(sum[k]));
                res.add(map.get(sum[k]).get(0) + 1);
                res.add(map.get(sum[k]).get(1));
                return res;
            }
        }
        return res;
    }
}
