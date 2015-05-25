public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // immediately ac hahah
        // write your code here
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        
        int [][] dp = new int[m + 1][n + 1];
        dp[m][n] = grid[m - 1][n - 1];
        for (int i = n - 1; i >= 1; i--) {
            dp[m][i] = dp[m][i+1] + grid[m - 1][i - 1];
        }
        for (int j = m - 1; j >= 1; j--) {
            dp[j][n] = dp[j + 1][n] + grid[j - 1][n - 1];
        }
        for (int x = m - 1; x >= 1; x-- ) {
            for (int y = n - 1; y >= 1; y--) {
                dp[x][y] = Math.min(dp[x + 1][y], dp[x][y + 1]) + grid[x - 1][y - 1];
            }
        }
        return dp[1][1];
    }
}

