class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        String vow = "aeiouAEIOU";

        int l = 0, r = s.length() - 1;
        while(l < r){
            while(l < r && vow.indexOf(c[l]) == -1)
                l++;
            while(l < r && vow.indexOf(c[r]) == -1)
                r--;
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++; r--;
        }
        String ans = new String(c);
        return ans;
    }
}