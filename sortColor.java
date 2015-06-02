class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        //method 1: hashmap  空间复杂度； 时间复杂度遍历两边 O（n）
        // if (nums == null || nums.length == 0) {
        //     return;
        // }
        // HashMap<Integer, Integer> count = new HashMap<Integer,Integer>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (count.containsKey(nums[i])) {
        //         count.put(nums[i],count.get(nums[i]) + 1);
        //     } else {
        //         count.put(nums[i], 1);
        //     }
            
        // }
        // int j=0;
        // int k=0;
        // int z=0;
        // for ( j = 0; j < count.get(0); j++) {
        //     nums[j] = 0;
        // }
        
        // for ( k = j; k < j + count.get(1); k++) {
        //     nums[k] = 1;
        // }
        // for ( z = k; z < k + count.get(2); z++) {
        //     nums[z] = 2;
        // }
        // method 2: 这个方法非常的巧妙 感觉一下子 想到是有困难的
        // 如何把 两指针问题 变成三个指针
        if (nums == null || nums.length <= 1) {//debug
            return;
        }
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        int temp = 0;
        while (i <= right) {
            if (nums[i] == 0){
                temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left ++;
                i++;//debug add i++
                
            } else if (nums[i] == 1) {
                i++;
            } else {
                temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right --;
            }
                
        }
        
    }
}
