class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 0;
        int ans = 0;
        long tot = 0;

        while(r < nums.length){
            long num = nums[r];
            tot += num;

            while(num * (r - l + 1) > tot + k){
                tot -= nums[l];
                l++;
            }

            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}