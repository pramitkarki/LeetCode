class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(dividend == -1 && divisor == -1) return 1;

        int ans = 0;
        boolean flag = true;
        if(dividend < 0 ^ divisor < 0) flag = false;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while(dividend - divisor >= 0){
            int cou;
            for (cou = 0; dividend - (divisor << cou << 1) >= 0; cou++);            
            ans += 1 << cou;
            dividend -= divisor << cou;
        }
        return flag ? ans : ans * -1;
    }
}