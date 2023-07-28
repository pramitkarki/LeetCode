class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n+ 1];
        for(int[] x : dp)
            Arrays.fill(x, -1);
        int maxi = 0;
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '1'){
                    int cur = solve(i, j, matrix, dp);
                    if(cur > maxi) maxi = cur;
                }
            }
        return maxi * maxi;
    }

    static int solve(int i, int j, char[][] matrix, int[][] dp){
        if(i >= matrix.length || j >= matrix[0].length || matrix[i][j] == '0') return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int r = 1 + solve(i, j + 1, matrix, dp);
        int d = 1 + solve(i + 1, j + 1, matrix, dp);
        int b = 1 + solve(i + 1, j, matrix, dp);
        
        return dp[i][j] = Math.min(r, Math.min(d, b));
    }   
}