/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
public class Solution {
    /**
     *@param A, queries: Given an integer array and an query list
     *@return: The result list
     */
    public ArrayList<Long> intervalSum(int[] A, 
                                       ArrayList<Interval> queries) {
        // write your code here
        ArrayList<Long> res = new ArrayList<Long>();
        Long [] sum = new Long[A.length + 1];
        int t = 0;
        sum[0] = new Long(0);
        for (int i = 0;  i < A.length; i++) {
            sum[i + 1] = sum[i] + new Long(A[i]);
        }
        for (Interval r : queries) {
            Long temp = sum[r.end + 1] - sum[r.start];
            res.add(temp);
        }
        return res;
    }
}

