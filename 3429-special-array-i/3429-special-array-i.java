class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length <= 1) return true;
        boolean flag = nums[0] % 2 == 0;
        for(int i = 1; i < nums.length; i++){
            boolean parity = nums[i] % 2 == 0;
            if(flag == parity) return false;
            else flag = parity;
        }
        return true;
    }
}