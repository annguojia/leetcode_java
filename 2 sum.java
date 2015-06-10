public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int [] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                res[0] = map.get(numbers[i]) + 1;
                res[1] = i + 1;
                break;
                
                
            } else {
                map.put(target - numbers[i], i);//为什么hashmap存的是 
            }
        }
        return res;
        //method 2: two pointers 不能用sort 是因为sort 之后 index的顺序都变了
        // if (numbers == null || numbers.length == 0) {
        //     return null;
        // }
        // Arrays.sort(numbers);
        // int[] res = new int[2];
        // int start = 0;
        // int end = numbers.length - 1;
        // while (start < end){
        //     int sum = numbers[start] + numbers[end];
        //     if (sum == target) {
        //         res[0] = start + 1;
        //         res[1] = end + 1;
        //         return res;
        //     } if (sum < target) {
        //         start++;
        //     } else {
        //         end--;
        //     }
            
        // }
        // return res;
    }
}
