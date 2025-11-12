class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int curr = 0;

        for(int x : nums){
            if(x == 0){
                ans = Math.max(ans, curr);
                curr = 0;
                continue;
            }
            curr++;
        }
        ans = Math.max(ans, curr);
        return ans;
    }
}