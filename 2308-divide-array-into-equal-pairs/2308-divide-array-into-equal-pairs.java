class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int x : nums)
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        int cou = 0;
        for(Map.Entry<Integer, Integer> ele : hm.entrySet()){
            if(ele.getValue() >= 2) cou += ele.getValue() / 2;
        }
        //System.out.println(cou);
        return cou == nums.length/2;
    }
}