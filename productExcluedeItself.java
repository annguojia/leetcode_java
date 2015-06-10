public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> res = new ArrayList<Long>();
        if (A == null || A.size() ==0) {
            return res;
        }
        // int i = 0;
        for (int i = 0; i < A.size(); i++) {
            long temp = 1;
            for (int j = 0; j < A.size(); j++) {
                if (i != j ) {
                    temp = temp * A.get(j);
                } else {
                    temp = temp * 1;
                }
            }
            res.add(temp);
        }
        return res;
        
    }
}

