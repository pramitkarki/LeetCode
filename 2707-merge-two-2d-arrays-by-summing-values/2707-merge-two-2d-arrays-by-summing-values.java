class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int l = 0;
        int r = 0;
        List<int[]> lis = new ArrayList<>();

        while(l < nums1.length && r < nums2.length){
            if(nums1[l][0] == nums2[r][0]){
                lis.add(new int[]{nums1[l][0], nums1[l][1] + nums2[r][1]});
                l++;
                r++;
            }

            else if(nums1[l][0] > nums2[r][0]) lis.add(nums2[r++]);
            else lis.add(nums1[l++]);
        }
        
        while(l < nums1.length) lis.add(nums1[l++]);
        while(r < nums2.length) lis.add(nums2[r++]);

        int ans[][] = new int[lis.size()][2];
        for(int i = 0; i < lis.size(); i++){
            ans[i] = lis.get(i);
        }
        return ans;
    }
}