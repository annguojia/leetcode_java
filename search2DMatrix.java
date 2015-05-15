public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length ==0) {
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0){
            return false;
        }
    
        int i = matrix.length;
        int j = matrix[0].length;
        int start = 0;
        int end = i-1;
        int mid;
        //确定index i;
        // find the row index, the last number <= target 
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if (matrix[mid][0] == target){
                return true;
            }else if (matrix[mid][0] < target){
                start = mid;
            }else end = mid;
        }
        //find the last number <= target 
        if (matrix[end][0] <= target) {
            i = end;
        } else if (matrix[start][0] <= target) {
            i = start;
        } else {
            return false;
        }
        
        
        
        start = 0;
        end = j-1;
        
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if (matrix[i][mid] == target){
                return true;
            }else if (matrix[i][mid] < target){
                start = mid;
            }else end = mid;
        }
        //find the last number <= target 
        if (matrix[i][end] == target) {
            return true;
        } else if (matrix[i][start] == target) {
           return true;
        } else {
            return false;
        }
        
    }
}

