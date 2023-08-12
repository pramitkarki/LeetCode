class Solution {
    public int miceAndCheese(int[] arr1, int[] arr2, int k) {
        int n = arr1.length;
        int diff[] = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i++) {
            diff[i] = arr1[i] - arr2[i];
            ans += arr2[i];
        }
        Arrays.sort(diff);
        for(int i = 0; i < k; i++)
            ans += diff[n - i - 1];
        return ans;
    }
}