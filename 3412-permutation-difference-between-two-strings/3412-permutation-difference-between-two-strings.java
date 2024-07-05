class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            ans += Math.abs(i - t.indexOf(c));
        }
        return ans;
    }
}