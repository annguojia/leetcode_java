
public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
        // write your code here
        ArrayList <Integer> res = new ArrayList<Integer>();
        res.add(-1);
        res.add(-1);
        if (A == null || A.size() == 0)
            return res;
        int start = 0;
        int mid;
        int end = A.size() - 1;
        //first bound
        // 如果连first bound 都没有的话 就直接返回null 了  
        // 没必要再进行last bound的判断
        
        //debug 中出现的错误：关于 if else if 等用法的使用 和格式 if else if 
        //关于 start index 和 end index的 关系 判断条件
        while(start +1 < end){
            mid = start +(end - start)/2;
            if (A.get(mid) == target){
                end = mid;
                
            } else if (A.get(mid) > target){
                end = mid;
                
            } else if (A.get(mid) < target){
                start = mid;
                
            }
        }
        if (A.get(start) == target){
            res.set(0,start);
            
        } else if (A.get(end) == target){//debug 
            res.set(0,end);
            
        } else 
            return res;
            
        //last bound
        start = 0;
        end = A.size() - 1;
        while(start + 1 < end){
             mid = start +(end - start)/2;
            if (A.get(mid) == target){
                start = mid;
                
            } else if (A.get(mid) > target){
                    end = mid;
                
            } else if (A.get(mid) < target){
                    start = mid;
            }
                
        }
        
        if (A.get(end) == target){
            res.set(1,end);
            
        } else if (A.get(start) == target){
            res.set(1,start);
            
        } else if
            return res;
        
        
        return res;
        
        
    }
}

