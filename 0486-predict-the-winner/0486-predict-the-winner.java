class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        if(n <= 2) return true;
        int[][] dp = new int[n][n];
        for(int x[] : dp)
            Arrays.fill(x, -1);
        return solve(0, n - 1, nums, dp) >= 0;
    }
    static int solve(int l, int r, int[] nums,int[][] dp){
        if(l == r) return nums[l];
        if(dp[l][r] != -1) return dp[l][r];

        int left = nums[l] - solve(l + 1, r, nums, dp);
        int right = nums[r] - solve(l, r - 1, nums, dp);
        
        return dp[l][r] = Math.max(left, right);
    }
}