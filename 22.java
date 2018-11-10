/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        //if(head == null) return null;
        ListNode temp = head;
        while(k!=0){
            if(head == null) return null;
            head = head.next;
            k--; 
        }
        while(head != null){
            temp = temp.next;
            head = head.next;
        }
        return temp;
    }
}
