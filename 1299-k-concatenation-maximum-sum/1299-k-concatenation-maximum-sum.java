class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int n = arr.length;
        long sum = 0, max = 0;
        int cou = 0;
        long a[] = new long[2];
        long b[] = new long[2];
        int mod = (int)Math.pow(10,9) + 7;
        
        for(int i = 0; i < 2*n; i++){
            if(arr[i % n] < 0) cou++;
            sum += arr[i % n] % mod;
            if(sum < 0) sum = 0;
            max = Math.max(max, sum) % mod;
            if(i == n - 1){
                a[0] = sum % mod;
                a[1] = max % mod;
                if(k == 1) return (int) max % mod;
            }
            if(i == 2 *n - 1) {
                b[0] = sum % mod;
                b[1] = max % mod;
            }
        }
        if(cou == 2 * n) return 0;

        if(cou == 0){
            long ans = (max * k) / 2 % mod;
            return (int) ans;
        }

        if(cou < 2 * n){
            if(a[0] == b[0])
                return (int)max;
            else{
                long ans = (b[1] - a[1]) * (k - 2) % mod + b[1];
                return (int) ans % mod;
            }
        }
        return -1;
    }
}