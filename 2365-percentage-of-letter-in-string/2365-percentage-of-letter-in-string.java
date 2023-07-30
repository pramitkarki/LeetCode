class Solution {
    public int percentageLetter(String s, char letter) {
        int cou = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == letter) cou++;
        return (cou * 100 ) / s.length();
    }
}