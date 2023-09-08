class Solution {
    public Node copyRandomList(Node head) {
        Node iter = head;
        while(iter != null){
            Node front = iter.next;
            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = front;
            iter = front;
        }
        iter = head;
        while(iter != null){
            if(iter.random != null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        Node dummy = new Node(0);
        Node curr = dummy;

        while(iter != null){
            Node front = iter.next.next;
            curr.next = iter.next;
            iter.next = front;
            curr = curr.next;
            iter = front;
        }
        return dummy.next;
    }
}