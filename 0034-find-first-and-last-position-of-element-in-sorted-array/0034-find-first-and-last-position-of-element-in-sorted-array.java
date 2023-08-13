class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int mid = (l + r) / 2;
            if(target == nums[mid]){
                int temp = mid;
                while(temp <= r && nums[temp] == target){
                    ans[1] = temp;
                    temp++;
                }
                temp = mid;
                while(temp >= l && nums[temp] == target){
                    ans[0] = temp;
                    temp--;
                }
                break;
            }
            else if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return ans;
    }
}