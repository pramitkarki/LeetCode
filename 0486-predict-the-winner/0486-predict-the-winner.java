class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        if(n <= 2) return true;
        int[][] dp = new int[n][n];
        for(int x[] : dp)
            Arrays.fill(x, -1);
        int sum = 0;
        for(int x : nums) sum += x;
        int p1 = solve(0, n - 1, nums, dp);
        return p1 - (sum - p1) >= 0;
    }
    static int solve(int l, int r, int[] nums,int[][] dp){
        if(l > r) return 0;
        if(l == r) return nums[l];
        if(dp[l][r] != -1) return dp[l][r];

        int left = nums[l] + Math.min(solve(l + 2, r, nums, dp), solve(l + 1, r - 1, nums, dp));
        int right = nums[r] + Math.min(solve(l, r - 2, nums, dp), solve(l + 1, r - 1, nums, dp));
        
        return dp[l][r] = Math.max(left, right);
    }
}