class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = start; i != destination; i = (i + 1) % n) sum1 += distance[i];
        for(int i = destination; i != start; i = (i + 1) % n) sum2 += distance[i];
        return sum1 > sum2 ? sum2 : sum1;
    }
}