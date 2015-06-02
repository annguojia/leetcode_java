public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        // 方法一： hashmap 方法 time complexity :O(n) space complexity :O(n)
        // if (nums == null || nums.size() == 0) {
        //     return 0;
        // }
        // HashMap <Integer, Integer> check = new HashMap<Integer, Integer>();
        // for (int i = 0; i < nums.size(); i++) {
        //     if (check.containsKey(nums.get(i))) {
        //         check.put(nums.get(i),check.get(nums.get(i)) + 1);
        //     } else {
        //         check.put(nums.get(i), 1);
        //     }
        // }
        // for (int i = 0; i < nums.size(); i++) {
        //     if (check.get(nums.get(i)) > nums.size()/2) {
        //         return nums.get(i);
        //     }
        // }
        // return -1;
        // 方法二：nlogn 
        if (nums == null || nums.size() == 0) {
	           return 0;
	       }
       Collections.sort(nums);//debug Array -> Arrays
       return nums.get(nums.size()/2);// debug num.length/2 - 1 -> num.length/2
    }
}

