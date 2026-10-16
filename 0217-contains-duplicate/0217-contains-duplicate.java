import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int freq;
        for(int i=0; i<nums.length; i++){
            int ele=nums[i];
             freq=hm.getOrDefault(ele,0);
        
        if(freq >= 1){
            return true;
        }
        hm.put(ele,freq+1);
        }
            return false;
    }
}