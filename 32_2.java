import java.util.ArrayList;
import java.util.Stack;
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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
        if(pRoot == null) return res;
        
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(pRoot);
        while(!(stack1.empty() && stack2.empty())){
            ArrayList<Integer> temp = new ArrayList<>();
            while(!stack1.empty()){
                TreeNode t = stack1.pop();
                temp.add(t.val);
                if(t.left!= null) stack2.push(t.left);
                if(t.right!= null) stack2.push(t.right);
            }
            if(temp.size() != 0) res.add(temp);
            temp = new ArrayList<>();
            while(!stack2.empty()){
                TreeNode t = stack2.pop();
                temp.add(t.val);
                if(t.right!= null) stack1.push(t.right);
                if(t.left!= null) stack1.push(t.left);

            }
            if(temp.size() != 0) res.add(temp);
            
        }
        
        return res;
    }

}
