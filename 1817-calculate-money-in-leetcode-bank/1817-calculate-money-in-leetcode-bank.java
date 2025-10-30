class Solution {
    public int totalMoney(int n) {
        int lastDays = n % 7;
        int fullWeek = n / 7;
        int ans = 0;
        for(int i = 0; i < fullWeek; i++){
            int diff = i * (i + 1) / 2;
            int temp_n = 7 + i;
            ans += (temp_n * (temp_n + 1) / 2) - diff;
            System.out.println(ans + "----");
        }
        int diff = fullWeek * (fullWeek + 1) / 2;
        int rem = lastDays + fullWeek;
        System.out.println(ans);
        ans += (rem * (rem + 1) / 2) - diff;
        System.out.println(diff + "--" + rem + "--" + ans);
        return ans;        
    }
}