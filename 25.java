/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        if(list1.val > list2.val){
            head = list2;
            list2 = list2.next;
            head.next = null;

        }else{
            head = list1;
            list1 = list1.next;
            head.next = null;
        }
        
        ListNode first = head;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                head.next = new ListNode(list2.val);
                list2 = list2.next;
                head = head.next;
            }else{
                head.next = new ListNode(list1.val);
                list1 = list1.next;
                head = head.next;
            }
        }
        if(list1 == null) head.next = list2;
        else head.next = list1;
        return first;
    }
}
