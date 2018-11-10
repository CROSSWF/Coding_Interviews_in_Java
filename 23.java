/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null) return null;
        ListNode p1 = pHead,p2 = pHead;
        while(p1!=null && p2!=null){
            p1 = p1.next;
            if(p2.next == null) return null;
            p2 = p2.next.next;
            if(p1 == p2) break;
        }
        if(p2 != p1) return null;
        
        p2 = pHead;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return p1;
    }
}
