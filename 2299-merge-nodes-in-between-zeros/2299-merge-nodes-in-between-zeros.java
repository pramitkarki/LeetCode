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
    public ListNode mergeNodes(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){    
            if(curr.next == null) prev.next = curr.next;
            if(curr.val == 0) prev = curr;
            else{
                prev.val += curr.val;
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return head;
    }
}