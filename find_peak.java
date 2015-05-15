class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        //use binary search methods
        
        int start = 1;
        int end = A.length-2;//
        int mid;
        
        while(start <= end){
            mid = start + (end - start)/2;
            if (A[mid - 1]< A[mid]&& A[mid] > A[mid + 1]){
                return mid;
            }else if (A[mid - 1] < A[mid]){
                start = mid + 1;
                
            }else end = mid -  1;
            
            
        }
        return -1;
        
        
    }
}

