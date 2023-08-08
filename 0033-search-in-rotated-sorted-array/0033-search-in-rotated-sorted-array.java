class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int mid = (l + r) / 2;

            if(target == nums[mid]) return mid;
            if(nums[l] <= nums[mid]){
                if(target < nums[mid] && target >= nums[l])
                    r = mid - 1;
                else l = mid + 1;
            }
            if(nums[mid] <= nums[r]){
                if(target > nums[mid] && target <= nums[r])
                    l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }
}