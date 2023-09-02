class Solution {
    public String reverseVowels(String s) {
        String vow = "";
        for(char c : s.toCharArray()){
            if(isVowel(c))
                vow += String.valueOf(c);
        }
        int idx = 0;
        String ans = "";
        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(isVowel(c))
                ans = String.valueOf(vow.charAt(idx++)) + ans;
            else ans = String.valueOf(c) + ans;
        }
        return ans;
    }
    static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
            || c == 'I' || c == 'O' || c == 'U')
            return true;
        return false;
    }
}