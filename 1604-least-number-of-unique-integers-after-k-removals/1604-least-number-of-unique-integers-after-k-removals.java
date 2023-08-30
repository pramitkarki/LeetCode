class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : arr)
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : hm.keySet())
            pq.offer(hm.get(x));
        int itr = pq.size();
        for(int i = 0; i < itr; i++){
            if(k <= 0) break;
            //System.out.println(pq.peek());
            int x = pq.peek();
            if(x <= k) k -=  pq.poll();
            else break;
            //System.out.println(k);
        } 
        return pq.size();
    }
}