class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cou = 0;
        for(int x : time){
            int rem = x % 60;
            if(rem == 0 && hm.containsKey(rem)) cou += hm.get(rem);
            if(hm.containsKey(60 - rem)) cou += hm.get(60 - rem);      
            hm.put(rem, hm.getOrDefault(rem , 0) + 1);
        }
        return cou;
    }
}