public class Solution {
    /**
     * @param s: A string
     * @return: A list of lists of string
     */
    // method DFS 方法
    
    public ArrayList<ArrayList<String>> partition(String s) {
        // write your code here
        // method 1: DFS
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        if (s == null || s.length() ==0) {
            return result;
        }
        
        ArrayList<String> list = new ArrayList<String>();
        helper(s, list, 0, result);
        return result;
    }
    
    public boolean isPalindrome(String s) {
        // if (s == null || s.length() == 0) {
        //     return true;
        // }
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public void helper(String s, ArrayList<String> path, int pos, ArrayList<ArrayList<String>> result) {
        if (pos == s.length()) {
            //debug s.length() - 1 --> s.length()
            result.add(new ArrayList<String>(path));
            return;
        }
        for (int i = pos + 1; i <= s.length(); i++) {
            String prefix = s.substring(pos, i);
            if (!isPalindrome(prefix)) {
                continue;
            }

            path.add(prefix);
            helper(s, path, i, result);
            path.remove(path.size() - 1);
        }
        
    } 
        
    
}
