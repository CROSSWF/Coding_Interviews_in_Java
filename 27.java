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
    public void Mirror(TreeNode root) {
        if(root == null);
        else if(root.left != null || root.right != null){
            TreeNode tr = root.left;
            root.left = root.right;
            root.right = tr;
            Mirror(root.left);
            Mirror(root.right);
        }
        
    }
}
