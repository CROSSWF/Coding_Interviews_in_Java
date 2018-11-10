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
    int index = -1;
    String Serialize(TreeNode root) {

        StringBuffer sb = new StringBuffer();
        Serialize(root,sb);
        return sb.toString();
        
        
  }
    void Serialize(TreeNode root,StringBuffer sb){
        
        if(root == null){
            sb.append("#,");
            return;
        }
        
        sb.append(root.val+",");
        Serialize(root.right,sb);
        Serialize(root.left,sb);
    }
      
    TreeNode Deserialize(String str) {
        index++;       
        String[] temp = str.trim().split(",");
        TreeNode tr = null;
        if(!temp[index].equals("#")){
            tr = new TreeNode(Integer.parseInt(temp[index]));
            tr.right = Deserialize(str);
            tr.left = Deserialize(str);
        }

        return tr;
  }
}
