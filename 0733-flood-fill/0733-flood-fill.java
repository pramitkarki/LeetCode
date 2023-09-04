class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int curr = image[sr][sc];
        if(curr != color) solve(image, sr, sc, curr, color);
        return image;
    }
    public void solve(int[][] image, int sr, int sc, int curr, int color){
          if(image[sr][sc] == curr){
            image[sr][sc] = color;
            if(sc + 1 < image[0].length) solve(image, sr, sc + 1, curr, color);
            if(sc >= 1) solve(image, sr, sc - 1, curr, color);
            if(sr + 1 < image.length) solve(image, sr + 1, sc, curr, color);
            if(sr >= 1) solve(image, sr - 1, sc, curr, color);
        }
    }
}