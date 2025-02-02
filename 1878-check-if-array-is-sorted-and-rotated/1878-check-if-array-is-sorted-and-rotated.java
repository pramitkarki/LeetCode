class Solution {
    public boolean check(int[] nums) {
        if(nums.length <= 1) return true;
        int cou = 0;
        for(int i = 0; i < nums.length - 1; i++)
            if(nums[i] > nums[i + 1]) cou++;
        if(nums[0] < nums[nums.length -1]) cou++;
        return cou <= 1;
    }
}