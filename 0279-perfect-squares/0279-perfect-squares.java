class Solution {
    public int numSquares(int n) {
        int l = 1, r = n;
        int ans = 0;

        while(l <= r){
            int mid = r - (r - l) / 2;
            int temp = (int)Math.pow(mid, 2);
            if(temp > n) r = mid - 1;
            else{
                ans = Math.max(ans, mid);
                l = mid + 1;
            }
        }
        int[][] dp = new int[ans + 1][n + 1];
        for(int[] x : dp) Arrays.fill(x, -1);
        return solve(ans, n, dp);
    }
    static int solve(int i, int n, int[][] dp){
        if(i == 0 || n < 0) return (int)Math.pow(10, 9);
        if(n == 0) return 0;
        if(dp[i][n] != -1) return dp[i][n];

        int val = (int) Math.pow(i, 2);
        int take = 1 + solve(i, n - val, dp);
        int not = solve(i - 1, n, dp);
        return dp[i][n] = Math.min(take, not);
    }
}