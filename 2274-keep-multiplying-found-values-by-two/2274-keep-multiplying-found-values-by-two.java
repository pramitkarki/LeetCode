class Solution {
    public int findFinalValue(int[] nums, int original) {        
        if(originalFoundInNums(nums, original)) return findFinalValue(nums, original*2);
        return original;
    }
    private boolean originalFoundInNums(int[] nums, int original){
        for(int x : nums) if(x == original) return true;
        return false;
    }
}