import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
     int count=0;
     for(int i=0;i<nums.length;i++){
        int ele=nums[i];
if(hm.containsKey(ele)){
    count=count+hm.get(ele);
    hm.put(ele,hm.getOrDefault(ele,0)+1);
}else{
    hm.put(ele,1);
}
        // for(int j=i+1;j<nums.length;j++){
        //     if(nums[i] == nums[j]){
        //         count++;
                // return(i+" "+j);
        }
    //     }
    //  }
     return count;
    }
}