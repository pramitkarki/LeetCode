class Solution {
    public int uniquePaths(int m, int n) {
        m--;n--;
        int N = m + n;
        int r = (m > n) ? n : m;

        double sum = 1;
        for(int i = 0; i < r; i++){
            sum *= N - i;
            sum /= i + 1;
        }
        return (int)sum;
    }
}