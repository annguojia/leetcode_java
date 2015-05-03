import java.util.*;
class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
     public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
         //method 2: recursively
         ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
         if(nums==null||nums.size()==0)return res;
         permutation(nums,0,nums.size()-1,res);
         return res;
         
     }
     public void permutation(ArrayList<Integer> N, int start, int end, ArrayList<ArrayList<Integer>> res){
        
        if(start==end) res.add(new ArrayList<Integer>(N));
        if(start<end){
            for (int i=start;i<=end;i++){
                swap(N,start,i);
                permutation(N,start+1,end, res);
                swap(N,start,i);
                
                
            }
        }
     }
     public void swap(ArrayList <Integer> M, int A, int B){
         int temp= M.get(A);
         M.set(A, M.get(B));
         M.set(B, temp);
         
     }
     
     
     
         
     
    
    
    
}

