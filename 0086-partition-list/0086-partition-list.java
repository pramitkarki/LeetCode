class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode fake1 = new ListNode(0);
        ListNode fake2 = new ListNode(0);
        ListNode c1 = fake1, c2 = fake2;

        while(head != null){
            if(head.val < x){
                c1.next = head;
                c1 = head;
            }
            else{
                c2.next = head;
                c2 = head;
            }
            head = head.next;
        }
        c2.next = null;
        c1.next = fake2.next;
        return fake1.next;
    }
}