public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int row = obstacleGrid.length;
        int queue = obstacleGrid[0].length;
        
        if (obstacleGrid[0][0] == 1) {
            return 0;
        } 
        if (obstacleGrid[row - 1][queue - 1] == 1) {
            return 0;
        }
        
        int [][] result = new int [row + 1][queue + 1];
        result[row][queue] = 1;
        for (int i = row - 1; i >= 1; i--) {
           if (obstacleGrid[i - 1][queue - 1] != 1) {
               result[i][queue] = result[i + 1][queue];
           } else {
               result[i][queue] = 0;
           }
               
        }
    
        
        for (int j = queue - 1; j >= 1; j--  ) {
             if (obstacleGrid[row - 1][j - 1] != 1) {
               result[row][j] = result[row][j + 1];
           } else {
               result[row][j] = 0;
           }
            
        }
        
        for (int x = row - 1; x >= 1; x-- ) {
            for (int y = queue - 1; y >= 1; y--) {
                if (obstacleGrid[x - 1][y - 1] != 1) {
                    result[x][y] = result[x + 1][y] + result[x][y + 1]; 
                }
                else {
                    result[x][y] = 0;
                }
            }
        }
        return result[1][1];
            
        
        
    }
}
