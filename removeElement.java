public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int i = 0;
        int len = A.length - 1;
        while (i <= len) {
            if (A[i] == elem) {
                A[i] = A[len];
                len--;
            }
            else {
                i++;
            }
        }
        //debug place return i + 1 -----> return len + 1;
        return len + 1;
       
        
    }
}

