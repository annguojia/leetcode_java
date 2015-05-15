import java.util.Arrays;
class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
    //write your code here
    /**
     * 这里面有的问题
     * 1， 为什么条件是start+1<end
     * 2,  为什么在while loop中end start 没有加1 而是 end=mid start=mid
     * 3,  如果不是找到 the first index的话 应该会简单一点
     */
    if(nums==null||nums.length==0)
        return -1;
    if(nums.length==1)
        return nums[0]==target?0:-1;
    int start = 0;
    int mid;
    int end = nums.length - 1;
    // int mid = (start + end) / 2;
    while(start+1<end){
        mid = (start + end) / 2;
        if (nums[mid] ==target) 
            end = mid;
        if (nums[mid] < target)
            start = mid + 1;
        if (nums[mid] > target)
            end = mid - 1;
    }
    
    if (nums[start] == target) {
        return start;
    }
    if (nums[end] == target) {
        return end;
    }

    return -1; 
    
    }
}
