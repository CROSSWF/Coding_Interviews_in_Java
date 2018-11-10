import java.util.ArrayList;
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
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null) return null;
        ArrayList<TreeNode> al = new ArrayList<>();
        pre(pRoot,al);
        if(k > al.size() || k < 1) return null;
        return al.get(k-1);        
    }

    void pre(TreeNode pRoot,ArrayList<TreeNode> al){
        
        if(pRoot.left != null) pre(pRoot.left,al);
        al.add(pRoot);
        if(pRoot.right != null) pre(pRoot.right,al);
    }

}
