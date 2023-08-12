class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int x[] : dp) Arrays.fill(x, -1);
        return solve(0, 0, m, n, obstacleGrid, dp);
    }
    static int solve(int i, int j, int m, int n, int[][] arr, int[][] dp){
        if(i >= m || j >=n || i < 0 || j < 0) return 0;
        if(arr[i][j] == 1) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(i == m - 1 && j == n -1) return 1;
        int r = solve(i, j + 1, m, n, arr, dp);
        int d = solve(i + 1, j, m, n, arr, dp);
        return dp[i][j] = r + d;
    }
}