/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode p = new ListNode(0);
        ListNode q = null;
        while(head != null){
            q = head;
            head = head.next;
            q.next = p.next;
            p.next = q;
        }
        return p.next;
    }
}
