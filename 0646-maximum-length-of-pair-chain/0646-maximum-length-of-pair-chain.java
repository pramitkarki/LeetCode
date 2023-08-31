class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        // for(int x[] : pairs)
        //     System.out.println(x[0] +" " +x[1]);
        int start = pairs[0][0];
        int end = pairs[0][1];
        int cou = 1;

        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0] > end){
                end = pairs[i][1];
                cou++;
            }
        }
        return cou;
    }
}