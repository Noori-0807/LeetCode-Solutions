import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
          for(int i=0;i<nums.length;i++){
        int val=nums[i];
        if(hm.containsKey(val)){
            int current=hm.get(val);
            hm.put(val,current+1);

        }
        else{
            hm.put(val,1);
        }
       }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int ans = 0;
            for (int key : hm.keySet()) {
                int freq=hm.get(key);
                if (freq > maxFreq) {
                    maxFreq =freq;
                    ans = key;
                }
            }
            result[i] = ans;
            hm.remove(ans);
        }
        return result;
    }
}