class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        if(nums.length == 1) return ans;

        int lenIncr = 1;
        int lenDecr = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                lenIncr++;
                ans = Math.max(ans, lenDecr);
                lenDecr = 1;
            }
            else if(nums[i] > nums[i+1]){
                lenDecr++;
                ans = Math.max(ans, lenIncr);
                lenIncr = 1;
            }
            else{
                lenIncr = 1;
                lenDecr = 1;
            }
            ans = lenIncr > lenDecr ? Math.max(ans, lenIncr) : Math.max(ans, lenDecr);
            //System.out.println("incr " + lenIncr +"\n decr" + lenDecr);
        }
        return ans;
    }
}