class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode h = new ListNode(0);
        ListNode t = new ListNode(0);
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode pre = fake;

        int idx = 1;
        while(curr != null){
            if(idx == left)
                h = curr;
            if(idx == right)
                t = curr;
            if(idx < left) pre = pre.next;
            idx++;
            curr = curr.next;
        }
        ListNode rem = t.next;
        t.next = null;
        t = rev(h);
        System.out.println(t.val);
        h.next = rem;
        pre.next = t;
        return fake.next;
    }
    public ListNode rev(ListNode node){
        ListNode prev = null;
        while(node != null){
            ListNode nxt = node.next;
            node.next = prev;
            prev = node;
            node = nxt;
        }
        return prev;
    }
}