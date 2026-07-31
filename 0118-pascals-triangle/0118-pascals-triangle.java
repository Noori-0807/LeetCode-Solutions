import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) {
            return ans;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            // First element
            temp.add(1);
            // Middle elements
            for (int j = 1; j < i; j++) {
                temp.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }
            // Last element
            temp.add(1);
            ans.add(temp);
        }
 return ans;
    }
}