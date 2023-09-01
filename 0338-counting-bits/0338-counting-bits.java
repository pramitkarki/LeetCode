class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for(int i = 0; i <= n; i++){
            ans[i] = solve(i);
        }
        return ans;
    }
    static int solve(int num){
        int bit = 0;
        while(num != 0){
            if(num % 2 == 1) bit++;
            num /= 2;
        }
        return bit;
    }
}