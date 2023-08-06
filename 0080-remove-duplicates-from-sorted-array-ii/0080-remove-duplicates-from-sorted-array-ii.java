class Solution {
    public int removeDuplicates(int[] nums) {
        int ins = 1;
        int cou = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[ins++] = nums[i];
                cou = 1;
            }
            else cou++;
            if(cou == 2)
                nums[ins++] = nums[i - 1];
        }
        return ins;
    }
}