class Solution {
    public boolean canPartition(int[] nums) {
        int k = 0;
        for(int x : nums)
            k += x;
        if(k % 2 == 1) return false;
        else k /= 2;
        int[][] dp = new int[nums.length][k + 1];
        for(int x[] : dp)
            Arrays.fill(x, -1);

        return solve(0, k, nums, dp);
    }
    static boolean solve(int i, int k, int[] arr, int[][] dp){
        if(k == 0) return true;
        if(i == arr.length -1) return arr[i] == k;
        if(dp[i][k] != -1)
            return dp[i][k] == 1 ? true : false;
        boolean take = false;
        if(k >= arr[i])
            take = solve(i + 1, k - arr[i], arr, dp);
        boolean not = solve(i + 1, k, arr, dp);
        dp[i][k] = (take || not) ? 1 : 0;
        return take || not;
    }
}