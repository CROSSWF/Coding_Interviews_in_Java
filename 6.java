/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> temp = new ArrayList<>();
        ListNode p = new ListNode(0);
        ListNode q = null;
        while(listNode != null){
            q = listNode;
            listNode = listNode.next;
            q.next = p.next;
            p.next = q;
        }
        p = p.next;
        while(p != null){
            temp.add(p.val);
            p = p.next;

        }

        return temp;
    }
}
