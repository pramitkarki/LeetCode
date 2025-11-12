class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverseArray(nums, 0, nums.length - k);
        reverseArray(nums, nums.length - k, nums.length);
        reverseArray(nums,0, nums.length);
    }
    public void reverseArray(int[] arr, int l, int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r - 1];
            arr[r - 1] = temp;
            l++; r--;
        }
    }
}