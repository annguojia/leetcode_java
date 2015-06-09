public class Solution {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public ArrayList<String> anagrams(String[] strs) {
        // write your code here
        ArrayList<String> result = new ArrayList<String>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        // debug place  hashmap 里面存入的value不是number 而是 index
        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList <Integer>>();
        
        for (int i = 0; i < strs.length; i++) {
            if (!map.containsKey(helper(strs[i]))) {
                ArrayList<Integer> path = new ArrayList<Integer>();
                path.add(i);
                // debug place map.put(helper(strs[i]), path.add(i))
                map.put(helper(strs[i]), path);
            } else {
                // debug place map.put(helper(strs[i]), map.get(helper(strs[i])).add(i));
                map.get(helper(strs[i])).add(i);
            }
        }
        
        for (int k = 0; k < strs.length; k++) {
            if (map.get(helper(strs[k])).size() > 1) {
                result.add(strs[k]);
            }
        }
        
        return result;
    }
    public String helper(String str) {
        
        char[] charStr = str.toCharArray();
        Arrays.sort(charStr);
        return String.valueOf(charStr);
       
    }
}
