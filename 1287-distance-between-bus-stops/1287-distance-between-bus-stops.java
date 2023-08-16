class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start > destination) return distanceBetweenBusStops(distance, destination, start);
        int n = distance.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < 2 * n; i++){
            if(i >= start && i < destination) sum1 += distance[i];
            else if(i >= destination && i < start + n) sum2 += distance[i % n];
        }
        return sum1 > sum2 ? sum2 : sum1;
    }
}