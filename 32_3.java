import java.util.ArrayList;
import java.util.*;

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
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
   
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
        if(pRoot == null) return res;
        
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.offer(pRoot);
        while(!(queue1.isEmpty() && queue2.isEmpty())){
            ArrayList<Integer> temp = new ArrayList<>();
            while(!queue1.isEmpty()){
                TreeNode t = queue1.poll();
                temp.add(t.val);
                if(t.left!= null) queue2.offer(t.left);
                if(t.right!= null) queue2.offer(t.right);
            }
            if(temp.size() != 0) res.add(temp);
            temp = new ArrayList<>();
            while(!queue2.isEmpty()){
                TreeNode t = queue2.poll();
                temp.add(t.val);
                if(t.left!= null) queue1.offer(t.left);
                if(t.right!= null) queue1.offer(t.right);

            }
            if(temp.size() != 0) res.add(temp);
            
        }
        
        return res;
    }
    
}
