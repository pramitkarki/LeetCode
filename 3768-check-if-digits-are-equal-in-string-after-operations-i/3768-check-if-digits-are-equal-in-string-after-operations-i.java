class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() > 2){
            String temp = "";
            for(int i = 0; i < s.length() - 1; i++){
                int num = (int) (s.charAt(i) + s.charAt(i+1) - '0' - '0');
                temp += num % 10;
                System.out.println(num);
            }
            s = temp;
        }
        return s.charAt(0) == s.charAt(1);
    }
}