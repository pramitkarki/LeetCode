class Solution {
    public int[][] merge(int[][] intv) {
        Arrays.sort(intv, (a,b)-> a[0] - b[0]);
        List<int[]> lis = new ArrayList<>();
        int start = intv[0][0];
        int end = intv[0][1];

        for(int i = 1; i < intv.length; i++){
            if(intv[i][0] <= end){
                end = Math.max(end,intv[i][1]);
            }
            else{
                lis.add(new int[]{start, end});
                start = intv[i][0];
                end = intv[i][1];
            }
        }
        lis.add(new int[]{start, end});
        int[][] ans = new int[lis.size()][2];
        for(int i = 0; i < lis.size(); i++)
            ans[i] = lis.get(i);
        return ans;
    }
}