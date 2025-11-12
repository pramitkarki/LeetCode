class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) continue;
            int temp = nums[idx];
            nums[idx++] = nums[i];
            nums[i] = temp;
        }
    }
}