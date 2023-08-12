class Solution {
    public int coinChange(int[] coins, int amt) {
        int dp[][] = new int[coins.length][amt + 1];
        for(int x[] : dp) Arrays.fill(x, -1);
        int ans = solve(0, coins, amt, dp);
        if(ans >= (int)Math.pow(10,9))
            return -1;
        return ans;
    }
    static int solve(int i, int[] arr, int amt, int[][]dp){
        if(i == arr.length - 1){
            if(amt % arr[i] == 0) return amt / arr[i];
            else return (int)Math.pow(10, 9);
        }
        if(dp[i][amt] != -1) return dp[i][amt];
        int not = solve(i + 1, arr, amt, dp);
        int take = (int)Math.pow(10, 9);
        if(arr[i] <= amt) take = 1 + solve(i, arr, amt - arr[i], dp);
        return dp[i][amt] = Math.min(take, not);

    }
}