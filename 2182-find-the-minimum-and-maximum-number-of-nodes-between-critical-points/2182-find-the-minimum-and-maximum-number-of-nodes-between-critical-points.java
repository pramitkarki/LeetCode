/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next == null) return new int[]{-1,-1};
        int maxIdx = Integer.MIN_VALUE;
        int minIdx = Integer.MAX_VALUE;
        ListNode prev = head;
        ListNode curr = head.next;        
        int idx = 1;
        int minDist = Integer.MAX_VALUE;
        int prevCritP = Integer.MAX_VALUE;

        while(curr.next != null){
            ListNode nxt = curr.next;
            if((prev. val < curr.val && curr.val > nxt.val) ||
                prev.val > curr.val && curr.val < nxt.val){
                    minIdx = Math.min(minIdx, idx);
                    maxIdx = Math.max(maxIdx, idx);
                    minDist = Math.min(minDist, Math.abs(idx - prevCritP));
                    prevCritP = idx;
                }
            idx++;
            prev = curr;
            curr = curr.next;
        }
        //System.out.println(maxIdx + " " + minIdx);
        if(maxIdx != Integer.MIN_VALUE && minIdx != Integer.MAX_VALUE && minIdx != maxIdx) return new int[]{minDist, maxIdx - minIdx};
        else return new int[]{-1,-1};
    }
}