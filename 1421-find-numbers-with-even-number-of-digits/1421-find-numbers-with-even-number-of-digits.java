class Solution {
    public int findNumbers(int[] nums) {
        String arr[] = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        int cou = 0;
        for(String x : arr){
            if(x.length() % 2 == 0) cou++;
        }
        return cou;
    }
}