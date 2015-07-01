public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int j = 0; j < t.length(); j++) {
            if (!map.containsKey(t.charAt(j))) {
                return false;
            } else {
                int temp = map.get(t.charAt(j));
                map.put(t.charAt(j), temp - 1);
            }
        }
        Iterator iter = map.keySet().iterator(); 
        while (iter.hasNext()) { 
            Object key = iter.next(); 
            Integer val = map.get(key); 
            if (val != 0) {
                return false;
            }
        } 
        return true;
        
    }
};
