public class Solution {
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // write your code here
        if(triangle == null || triangle.size() == 0) return 0;
        int m = triangle.size();
        // int n = triangle.get(0).size();
        int [][] dp = new int [m+1][m+1];
        
       
        for (int i = 1;i <= m; i++ ) {
            dp[m][i] = triangle.get(m - 1).get(i - 1);
        }
        
     
        for(int i = m-1; i >=1; i-- ) {//debug place i-- not i++
           for (int j = 1; j <= i; j++) {
                dp[i][j] = triangle.get(i - 1).get(j - 1) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);  
           }
          
        }
       
        return dp[1][1];
    }
}

