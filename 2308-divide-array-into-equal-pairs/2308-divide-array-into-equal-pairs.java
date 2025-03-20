class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> hs = new HashSet<>()    ;
        for(int x : nums){
            if(hs.contains(x)) hs.remove(x);
            else hs.add(x);
        }
        return hs.isEmpty();
    }
}