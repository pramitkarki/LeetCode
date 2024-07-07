class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles < numExchange) return numBottles;
        return numBottles + dfs(numBottles, numExchange);
    }
    public int dfs(int empty, int xchng){
        if(empty < xchng) return 0;
        int full = empty / xchng;
        return full + dfs(full + (empty % xchng), xchng); 
    }
}