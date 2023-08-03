class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        f(0, nums, ans);
        return ans;
    }
    static void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    static void f(int idx, int[] nums, List<List<Integer>> ans){
        if(idx == nums.length){
                List<Integer> lis = new ArrayList<>();
                for(int x : nums) lis.add(x);
                ans.add(lis);
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(nums, idx, i);
            f(idx + 1, nums, ans);
            swap(nums, idx, i);
        }
    }
}