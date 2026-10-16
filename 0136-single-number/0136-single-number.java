import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int ele=nums[i];
        hm.put(ele,hm.getOrDefault(ele,0)+1);
          
        }
        for(int key : hm.keySet()){
            if(hm.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}