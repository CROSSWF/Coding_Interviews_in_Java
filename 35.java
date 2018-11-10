/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) return null;
        RandomListNode pc = pHead;
        while(pc!=null){
            RandomListNode temp = new RandomListNode(pc.label);
            temp.next = pc.next;
            pc.next = temp;
            pc = temp.next;
        }
        
        pc = pHead;
        while(pc!=null){
            RandomListNode temp = pc.next;
            if(pc.random!=null){
            temp.random = pc.random.next;
            }
            pc = temp.next;
        }
        
        pc = pHead;
        
        RandomListNode start = pc.next;
        RandomListNode temp = pc.next;
        while(pc != null){
            pc.next = temp.next;
            if(pc.next != null){
            temp.next = pc.next.next;
            }else{
                temp.next = null;
            }
            pc = pc.next;
            temp = temp.next;
        }
        
        return start;
    }
}
