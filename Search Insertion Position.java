public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            if (target == nums[0]) {
                return 0;
            } else if (target > nums[0]){
                return 1;
            } else 
                return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start)/2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid;
            } else start = mid;
            
        }
        if (nums[start] >= target) {
            return start;
        } else if(nums[end] >= target) {
            return end;
        }else 
            return end + 1;
        
        
    }
}