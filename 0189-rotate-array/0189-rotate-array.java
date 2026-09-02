class Solution {

    public void rotate(int[] nums, int k) {
         k = k % nums.length;
         //  Reverse entire array
        int left = 0;
        int right = nums.length - 1;
         while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        // Reverse first k elements
        left = 0;
        right = k - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        //  Reverse remaining elements
        left = k;
        right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}