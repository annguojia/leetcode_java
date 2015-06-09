public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if (strs == null ||strs.length == 0) {
            return "";
        }
        int minLen = strs[0].length();
        for (String str : strs) {
            if (str.length() < minLen) {
                minLen = str.length();
            }
        }
        String res = "";
        int index = 0;
        while (index < minLen) {
            for (int i = 1; i < strs.length; i++ ) {
                if (strs[0].charAt(index) != strs[i].charAt(index)) {
                    return strs[0].substring(0, index);
                } 
            }
            index++;
            
        }
        return strs[0].substring(0, index);
        
    }
}
