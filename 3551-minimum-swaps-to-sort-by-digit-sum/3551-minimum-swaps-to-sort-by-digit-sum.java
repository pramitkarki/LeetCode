class Solution {
    public int minSwaps(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = digSum(nums[i]);
        }

        Integer[] idx = new Integer[nums.length];
        for(int i = 0; i < idx.length; i++)
            idx[i] = i;
        
        Arrays.sort(idx, (a,b) -> {
            if(arr[a] != arr[b]) {
                return Integer.compare(arr[a], arr[b]);
            }
            return Integer.compare(nums[a], nums[b]);
        });

        int[] target = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            target[idx[i]] = i;

        boolean[] visited = new boolean[arr.length];
        int cycle = 0;
        for(int i = 0; i < arr.length; i++){
            if(visited[i]) continue;
            cycle++;
            int j = i;
            while(!visited[j]){
                visited[j] = true;
                j = target[j];
            }
        }
        return arr.length - cycle;
    }
    
    private int digSum(int num){
        int sum = 0;
        while(num != 0){
            int dig = num % 10;
            sum += dig;
            num /= 10;
        }
        return sum;
    }
}