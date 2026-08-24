class Solution {
    public int maximumDifference(int[] nums) {
        int diff=(-1);
        int n=nums.length;
        int low=nums[0];
        for(int i=0;i<n;i++){
           low=Math.min(low,nums[i]); 
           if(nums[i]>low){
           diff=Math.max(diff,nums[i]-low);
        
           } 
        }
        return diff;
    }
}