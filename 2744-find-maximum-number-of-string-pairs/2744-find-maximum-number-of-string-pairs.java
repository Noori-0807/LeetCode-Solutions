class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String s1 = words[i];
                String s2 = words[j];
                // reverse s2
                String rev = "" + s2.charAt(1) + s2.charAt(0);
                if (s1.equals(rev)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}