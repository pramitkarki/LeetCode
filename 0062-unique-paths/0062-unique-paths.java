class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int x[] : dp)   Arrays.fill(x , -1);
        return solve(0, 0, m, n, dp);
    }
    static int solve(int i, int j, int m, int n, int[][] dp){
        if(i >= m || j >= n) return 0;
        if(i == m - 1 && j == n - 1) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        int d = solve(i, j + 1, m, n, dp);
        int r = solve(i + 1, j, m, n, dp);
        return dp[i][j] = d + r;
    }
}