class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int mid = r - (r - l) / 2;
            if(nums[l] <= nums[mid]){
                min = Math.min(min, nums[l]);
                l = mid + 1;
            }
            else{
                min = Math.min(min, nums[mid]);
                r = mid - 1;
            }
        }
        return min;
    }
}