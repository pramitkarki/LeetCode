class Solution {
    public int totalMoney(int n) {
        int lastDays = n % 7;
        int fullWeek = n / 7;
        int ans = 0;
        for(int i = 0; i < fullWeek; i++){
            int diff = i * (i + 1) / 2;
            int tempN = 7 + i;
            ans += (tempN * (tempN + 1) / 2) - diff;
        }
        int diff = fullWeek * (fullWeek + 1) / 2;
        int rem = lastDays + fullWeek;
        ans += (rem * (rem + 1) / 2) - diff;
        return ans;        
    }
}