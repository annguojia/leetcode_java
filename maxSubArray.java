public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int [] dp = new int [nums.size()];
        dp[0] = nums.get(0);
        int max = dp[0];//debug MAX_VALUE -> dp[0]
        for (int i = 1; i < nums.size(); i++) {
            if (dp[i - 1] <= 0) {
                dp[i] = nums.get(i);
            } else {
                dp[i] = dp[i - 1] + nums.get(i);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
