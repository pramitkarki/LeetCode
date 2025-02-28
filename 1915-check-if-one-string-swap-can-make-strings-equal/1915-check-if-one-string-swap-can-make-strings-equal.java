class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int idx1 = 0;
        int idx2 = 0;
        int cou = 0;

        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != c2){
                cou++;
                if(cou > 2) return false;
                if(cou == 1) idx1 = i;
                if(cou == 2) idx2 = i;
            }
        }
        
        return (s1.charAt(idx1) == s2.charAt(idx2)) && (s1.charAt(idx2) == s2.charAt(idx1));
    }
}