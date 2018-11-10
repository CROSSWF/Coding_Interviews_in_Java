import java.util.ArrayList;
import java.util.Stack;
import java.util.Iterator;
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>(); 
        ArrayList<TreeNode> tempal = new ArrayList<>();
        if(root == null) return result;
        tempal.add(root);
        while(tempal.size()>0){
            TreeNode tn = tempal.get(0);
            result.add(tn.val);
            if(tn.left != null) tempal.add(tn.left);
            if(tn.right != null) tempal.add(tn.right);
            tempal.remove(0);
        }
        
        Iterator it = result.iterator();
        return result;
        
    }
    
}
