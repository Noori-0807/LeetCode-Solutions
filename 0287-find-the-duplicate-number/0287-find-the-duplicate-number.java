import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
        int duplicate=-1;
       for(int i = 0; i < nums.length; i++){
        int ele=nums[i];
        if(hs.contains(ele)){
            duplicate = ele;
            break;
        }else{
            hs.add(ele);
        }
       }
       return duplicate; 
    }
}