/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null) return null;
        if(pNode.right != null){
            TreeLinkNode temp = pNode.right;
            while(temp.left != null) temp = temp.left;
            return temp;
        }
        
        while(pNode.next != null){
            TreeLinkNode f = pNode.next;
            if(pNode == f.left) return f;
            else pNode = f;
        }
        
        return null;
        
    }
}
