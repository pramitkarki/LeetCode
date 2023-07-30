class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int cou = 0;
        for(int x : nums){
            if(hs.contains(x)){
                cou++;
                hs.remove(x);
            }
            else hs.add(x);
        }
        //System.out.println(cou);
        int ans[] = new int[2];
        ans[0] = cou;
        ans[1] = nums.length - cou*2;
        return ans;
    }
}