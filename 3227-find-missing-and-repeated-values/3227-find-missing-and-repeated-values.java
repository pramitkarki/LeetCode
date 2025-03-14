class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int rem = -1;
        int miss = -1;
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= n*n; i++)
            set.add(i);

        for(int x[] : grid){
            for(int y : x){
                if(set.contains(y)){
                    set.remove(y);
                }
                else rem = y;
            }
        }
        miss = set.toArray(new Integer[1])[0];

        return new int[]{rem, miss};
    }
}