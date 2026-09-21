import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (!hs.contains(temp)) {
                hs.add(temp);
            } else {
                duplicate = temp;
            }
        }
        int missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int[]{duplicate, missing};
    }
}