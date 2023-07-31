class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            str[i] = String.valueOf(nums[i]);
        Arrays.sort(str, (a,b)->{
            String t1 = a + b;
            String t2 =  b + a;
            return t2.compareTo(t1);
        });

        if(str[0].equals("0")) return "0";
        String ans = "";
        for(String x : str) ans += x;
        return ans;
    }
}