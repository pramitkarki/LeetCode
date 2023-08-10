class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        int min = Integer.MAX_VALUE;
        for(int x : prices){
            min = Math.min(min, x);
            prof = Math.max(prof, x - min);
        }
        return prof;
    }
}