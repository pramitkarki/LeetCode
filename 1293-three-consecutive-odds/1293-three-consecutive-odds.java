class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cou = 0;
        for(int x : arr){
            if(x % 2 == 0) cou = 0;
            else cou++;
            if(cou >= 3) return true;
        }
        return false;
    }
}