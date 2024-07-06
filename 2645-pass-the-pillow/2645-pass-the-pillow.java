class Solution {
    public int passThePillow(int n, int time) {
        if(time < n) return time + 1;
        if(time == n) return time - 1;
        int mult = time / (n - 1);
        if(mult % 2 == 0) return (time - mult*(n - 1)) + 1;
        else return n - (time - mult*(n - 1));
    }
}