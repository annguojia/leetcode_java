public class Solution {
    /**
     * @param nums: an array of integers
     * @return: an integer
     */
    // debug place 对contiguous subarray的理解有错误
    public int maxProduct(int[] nums) {
        // write your code here
        //Note that, we need to consider two cases:
        // (1) negative numbers
        //Store the minimum product to handle the case that new element < 0. Because if current element < 0, the product of two negative numbers (new element, and minimum product before the new element) become positive.
        // (2) zeros
        //When meets zero, current max and min product become 0, new search is needed from the next element.
        //Therefore,  we can write down to function to store both + and - products:
        //max_product = max{A[i]*min_product (when A[i]<0),  A[i]*max_product (when A[i]>0),  A[i] (when 0 occurs before A[i]) }.
        //min_product = min{A[i]*min_product,  A[i]*max_product,  A[i] }.
        //Because current sequence might start from any element, to get the final result, we also need to store the max product after each iteration "res = max(res, maxp);".
        if (nums.length == 1) {
            return nums[0];
        }
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++ ) {
           int tmpmax = max;
           int tmpmin = min;
           max = Math.max(nums[i],Math.max(tmpmax*nums[i], tmpmin*nums[i]));
           min = Math.min(nums[i],Math.min(tmpmax*nums[i], tmpmin*nums[i]));
           res = Math.max(max,res);
        }
        return res;
    }
}
