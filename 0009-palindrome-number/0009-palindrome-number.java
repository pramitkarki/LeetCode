class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int revNum = 0;
        int curr = x;

        while(x != 0){
            int rem =  x % 10;
            int curr_rev = revNum*10 + rem;
            if((curr_rev - rem) / 10 != revNum) return false;
            revNum = curr_rev;
            x /= 10;
        }

        return revNum == curr;
    }
}