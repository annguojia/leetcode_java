public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        // Write your code here
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }
        int lenA = a.length();
        int lenB = b.length();
        int i = lenA - 1;
        int j = lenB - 1;
        String res = "";
        char carry = '0';
        while (i >= 0 && j >= 0) {
            if (a.charAt(i)  == '1' && b.charAt(j) == '0') {
                if (carry == '0') {
                    res = "1" + res;
                    
                }
                else {
                    res = "0" + res;
                    carry = '1';
                    
                }
                i--;
                j--;
            } else if (a.charAt(i)  == '0' && b.charAt(j) == '1') {
                if (carry == '0') {
                    res = "1" + res;
                    
                }
                else {
                    res = "0" + res;
                    carry = '1';
                }
                i--;
                j--;
                
            } else if (a.charAt(i)  == '1' && b.charAt(j) == '1'){
                if (carry == '0') {
                    res = "0" + res;
                    carry = '1';
                }
                else {
                    res = "1" + res;
                    carry = '1';
                }
                i--;
                j--;
            } else if (a.charAt(i)  == '0' && b.charAt(j) == '0'){
                if (carry == '0') {
                    res = "0" + res;
                    carry = '0';
                }
                else {
                    res = "1" + res;
                    carry = '0';
                }
                i--;
                j--;
            } 
            
            
        }
        while (i >= 0) {
            if (a.charAt(i) == '1') {
                if (carry == '1') {
                    res = "0" + res;
                    carry = '1';
                    
                }
                else {
                    res = "1" + res;
                }
                i--;
            } else {
                if (carry == '1') {
                    res = "1" + res;
                    carry = '0';
                    
                }
                else {
                    res = "0" + res;
                }
                i--;
            }
            
            
            
        }
        while (j >= 0) {
            if (b.charAt(j) == '1') {
                if (carry == '1') {
                    res = "0" + res;
                    carry = '1';
                }
                else {
                    res = "1" + res;
                }
                j--;
            } else {
                if (carry == '1') {
                    res = "1" + res;
                    carry ='0';
                    
                }
                else {
                    res = "0" + res;
                }
                j--;
            }
        }
        if (carry == '1') {
            res = "1" + res;
        }
        return res;
    }
}
