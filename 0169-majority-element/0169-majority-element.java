import java.util.*;
class Solution {
     public int majorityElement(int[] nums)
    {
    //  HashMap<Integer,Integer> hm=new HashMap<>();
        Arrays.sort(nums);
        int n=(nums.length)/2;
        return nums[n];
        // for(int i=0;i<nums.length;i++){
        //     int value=nums[i];
        //     hm.put(value,hm.getOrDefault(value,0)+1);
        // int s=hm.get(value);
        // if(s>n){
        // // for(int boom : hm.keySet()){
        //     return value;
        // }
        // }
        // return -1;
    }
} 
    
