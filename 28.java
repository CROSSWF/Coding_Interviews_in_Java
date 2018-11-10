/*
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
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null) return true;
        return isSymmetrical(pRoot.left,pRoot.right);
    }
    
    boolean isSymmetrical(TreeNode left,TreeNode right){
        if(right == null) return left == null;
        if(left == null) return false;
        if(left.val != right.val) return false;
        return isSymmetrical(right.left,left.right) && isSymmetrical(right.right,left.left);
    }
}
