import java.util.*;
class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        //method 1: not recursively
         ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(nums==null||nums.size()==0)return res;
       
        res.add(new ArrayList<Integer>());
        
        for(int i=0;i<nums.size();i++){
            ArrayList<ArrayList<Integer>> current= new ArrayList<ArrayList<Integer>>();
            for(ArrayList l: res){
                for(int j=0;j<l.size()+1;j++){
                    l.add(j,nums.get(i));
                    ArrayList <Integer> temp=new ArrayList<Integer>(l);
                    current.add(temp);
                    
                    l.remove(j);
                }
                
            }
            // write in this place we can alway alter current when arraylist increasing
            res= new ArrayList<ArrayList<Integer>>(current);
        }
        
        return res;
    }
    
   
}

