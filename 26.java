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
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        if(root2 == null) return false;
        if(root1 == null) return false;
        boolean result = false;
        if(root1.val == root2.val) {
            boolean result1 = temp(root1.left,root2.left);
            boolean result2 = temp(root1.right,root2.right);
            result = result1 && result2;
        }
        if(result == true) return true;
        else return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2); 
        
    }
    
    public boolean temp(TreeNode root1,TreeNode root2){
        
        if(root2 == null) return true;
        else if(root1 == null) return false;
        if(root1.val == root2.val) return temp(root1.left,root2.left) && temp(root1.right,root2.right);
        return false;
    }
}
