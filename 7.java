/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0) return null;
        if(pre.length == 1) return new TreeNode(pre[0]);
        
        TreeNode t = new TreeNode(pre[0]);
        int i = 0;
        while(in[i] != pre[0]) i++;
        
        int[] leftpre = new int [i];
        int[] leftin = new int [i];
        int[] rightpre = new int [pre.length - 1 - i];
        int[] rightin = new int [pre.length - 1 - i];

        
        for(int j = 0; j < i;j++){
            leftpre[j] = pre[j+1];
            leftin[j] = in[j];
        }
        for(int j = i+1; j< pre.length; j++){
            rightpre[j-i-1] = pre[j];
            rightin[j-i-1] = in[j];
        }
        
        t.left = reConstructBinaryTree(leftpre,leftin);
        t.right = reConstructBinaryTree(rightpre,rightin);
        
        return t;
    }
}
