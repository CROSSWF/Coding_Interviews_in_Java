import java.util.ArrayList;
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
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        Find(result,temp,target,root);
        
        return result;
    }
    public void Find(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> temp,int target,TreeNode root){
        ArrayList<Integer> newtemp = new ArrayList<>(temp);
        if(root.left == null && root.right == null){
            if(target == root.val){
                newtemp.add(root.val);
                result.add(newtemp);
                return;
            }
            else{
                return;
            }
        }
        int newtarget = target - root.val;
        newtemp.add(root.val);
        if(root.left != null){
            Find(result,newtemp,newtarget,root.left);
        }
        if(root.right != null){
            Find(result,newtemp,newtarget,root.right);            
        }
        
    }
}
