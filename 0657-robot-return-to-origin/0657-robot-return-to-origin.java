class Solution {
    public boolean judgeCircle(String moves) {
        int posx = 0;
        int posy = 0;
        for(char c : moves.toCharArray()){
            if(c == 'U') posy++;
            else if(c == 'D') posy--;
            else if(c == 'R') posx++;
            else posx--;
        }
        return posx == 0 && posy == 0;
    }
}