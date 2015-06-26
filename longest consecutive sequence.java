public class Solution {
    /**
     * @param nums: A list of integers
     * @return an integer
     */
    public int longestConsecutive(int[] num) {
        // write you code here
        
        // sort & search 方法没有实现 因为无法处理sequence中有相同的问题 forexample【0，1，1，2，100，300】
        // Arrays.sort(num);
        // int oldmax = 1;
        // int max = 1;
        // for (int i = 1; i < num.length; i++) {
        //     if (num[i] == num[i - 1] + 1 || num[i]) {
        //         max++;
        //     }else {
        //         oldmax = Math.max(oldmax, max);
        //         max = 1;
        //     } 
        // }
        // return Math.max(oldmax,max);
        
        // hashmap 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : num) {
            map.put(i,0 );
        }
        int res = 1;
        for(int i : num) {
            if(map.get(i) == 1) {
                continue;
            }
            int max = 1;
            int temp = i + 1;
            while(map.containsKey(temp)) {
                max++;
                map.put(temp, 1);
                temp++;
            }
            temp = i - 1;
            while(map.containsKey(temp)) {
                max++;
                map.put(temp, 1);
                temp--;
            }
            map.put(i, 1);
            res = Math.max(res, max);
        }
        return res;
    }
}
