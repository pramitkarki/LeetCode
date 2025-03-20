class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int x : nums) hs.put(x, hs.getOrDefault(x, 0) + 1);
        for(int x : nums) if(hs.get(x) % 2 != 0) return false;        
        return true;        
    }
}