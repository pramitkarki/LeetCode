class Solution {
    public int maxSum(int[] nums) {
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            int a = maxNum(nums[i]);
            for(int j = i + 1; j < nums.length; j++){
                int b = maxNum(nums[j]);
                if(a == b) ans = Math.max(ans, nums[i] + nums[j]);
            }
        }
        return ans;
    }
    static int maxNum(int a){
        int ans = -1;
        while(a != 0){
            int num = a % 10;
            ans = Math.max(ans, num);
            a /= 10;
        }
        return ans;
    }
}