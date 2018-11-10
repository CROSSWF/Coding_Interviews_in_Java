public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        
        if(root == null) return true;
          if(Math.abs(TreeDepth(root.left) - TreeDepth(root.right)) > 1) return false;
        
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
     
    public int TreeDepth(TreeNode root) {
         
        if(root == null) return 0;
         
        int l = TreeDepth(root.left);
        int r = TreeDepth(root.right);
         
        return l>r?(l+1):(r+1);
    }

}
