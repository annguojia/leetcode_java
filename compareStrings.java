public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        // 这个题的原因在于题意没有理解清楚； B并不是一定要是A的顺序 只要包含就行了
        // 超级傻逼的一道题 
        if (B == null || B.length() == 0){
            return true;
        }
        if (A == null || A.length() == 0 ){
            return false;
        }
        if (A.length() < B.length()){
            return false;
        }
        int A_len = A.length();
        int B_len = B.length();
        int [] storage = new int [26];
        for (int i = 0; i < A_len; i ++){
            storage[A.charAt(i) - 'A']++;
        }
        for (int j = 0; j < B_len; j ++){
            storage[B.charAt(j) - 'A']--;
            if(storage[B.charAt(j) - 'A'] < 0){
                return false;
            }
        }
        return true;
        // int i = 0;
        // int j = 0;
        
        // while( i < A_len ){
        //     if (j > B_len - 1 ) {
        //     return true;
        //     }
        //     if (A.charAt(i) == B.charAt(j)){
        //         j++;
        //     }
        //     i++;
        // }
        // if (j > B_len -1) return true;
        // return false;
        
    }


}
