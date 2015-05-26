public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
        //没有完全理解 还需要认真的看看答案
        // write your code here
        int [] dp = new int[A.length];
        dp[0] = 0;
        
        for (int i = 1; i < A.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if ( dp[j] != Integer.MAX_VALUE && j + A[j] >=i) {
                    dp[i] = dp[j] + 1; 
                    
                    break;
                }
            }
           
        }
        return dp[A.length - 1];
    }
}

