/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        TreeNode p = pRootOfTree;
        while(p.left != null) p = p.left;
        TreeNode pre = null; 
        temp(pRootOfTree);
        return p;
    }
    
    public void temp(TreeNode t){
        
        if(t.left != null) temp(t.left);
        if(pre != null){
            pre.right = t;
            t.left = pre;
        }
        pre = t;
        if(t.right != null) temp(t.right);
    }
}
