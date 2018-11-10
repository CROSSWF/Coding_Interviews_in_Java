/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        
        int i = 0,j=0;
        ListNode temp = pHead1;
        while(temp != null){
            temp = temp.next;
            i++;      
        }
        temp = pHead2;
        while(temp != null){
            temp = temp.next;
            j++;      
        }
        
        if( j > i){
            temp = pHead2;
            pHead2 = pHead1;
            pHead1 = temp;
            int k = j;
            j = i;
            i = k;
        }
        
        int d = i - j;
        
        while(d != 0){
            
            pHead1 = pHead1.next;
            d--;
        }
        
        while(pHead1 != pHead2){
            
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        
        return pHead1;
    }
}
