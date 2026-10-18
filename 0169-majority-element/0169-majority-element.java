import java.util.*;
class Solution {
     public int majorityElement(int[] nums){
     if(nums.length == 1){
          return nums[0];
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int ele=nums[i];
                hm.put(ele,hm.getOrDefault(ele,0)+1);
                if(hm.get(ele) > nums.length/2){
                    return ele;
                }
            }
            return -1;
        }
     }
    