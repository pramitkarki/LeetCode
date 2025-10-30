class Solution {
    public int numWaterBottles(int full, int exchange) {
        int ans = full;
        int empty = full;
        while((empty/exchange) > 0){
            int fill = empty / exchange;
            empty = fill + empty % exchange;
            ans += fill;
        }
        return ans;
    }
}