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
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null) return null;
        
        ListNode pre = new ListNode(0);
        ListNode S = pre;
        pre.next = pHead;
        ListNode p = pHead;
        
        while(p!=null){
            ListNode q = p.next;
            while(q!=null && q.val == p.val){
                q = q.next;
            }
            if(q != p.next){
                pre.next = q;
                p = q;
                continue;
            }
            
            pre = p;
            p = q;
        }

        return S.next;
    }
}
