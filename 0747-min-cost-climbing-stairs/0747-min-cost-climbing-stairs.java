class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return Math.min(solve(0, cost, dp), solve(1, cost, dp));
    }
    static int solve(int i, int[] arr, int[] dp){
        if(i >= arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int one = arr[i] + solve(i + 1, arr, dp);
        int two = arr[i] + solve(i + 2, arr, dp);
        return dp[i]=Math.min(one, two);
    }
}