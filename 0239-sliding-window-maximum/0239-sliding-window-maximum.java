class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 0 || nums == null) return null;
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        int idx = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            while(!dq.isEmpty() && dq.peek() == i - k) dq.poll();
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) dq.pollLast();
            dq.offer(i);

            if(i >= k - 1){
                ans[idx++] = nums[dq.peek()];
            }
        }
        return ans;
    }
}