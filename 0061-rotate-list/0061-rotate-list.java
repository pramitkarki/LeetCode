class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode curr = head;
        int len = 1;
        while(curr.next != null){
            curr = curr.next;
            len++;
        }
        curr.next = head;
        k = len - k % len;
        for(int i = 0; i < k; i++)
            curr = curr.next;
        
        head = curr.next;
        curr.next = null;
        return head;
    }
}