public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
       
        if (A == null || A.length == 0) { 
            return 0;
        } 
        int start =0;
        int end = A.length - 1;
        int mid;
        
        if (target < A[0]) {
            return 0;
        }
        
        while(start +1 < end) {
            
            mid = start + (end - start)/2;
            if (A[mid] == target){
               return mid;
            } else if (A[mid] > target){
                end = mid;
            } else if (A[mid] < target){
                start = mid;
            }
        }
        //find the last position < target
        if (A[end] ==  target){
            return end;
        } 
        if (A[end] < target){
            return end+1;
        }
        if (A[start] == target){
            return start;
        }
        return start + 1;
        
        
    }
}

