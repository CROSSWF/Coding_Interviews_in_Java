import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       if(matrix==null)
           return null;
       ArrayList<Integer> list=new ArrayList<Integer> ();
       int row=matrix.length;
       int col=matrix[0].length;
       int left=0,top=0,right=col-1,bottom=row-1;
       while(left<=right&&top<=bottom){
           
           for(int i=left;i<=right;i++){
               list.add(matrix[top][i]);
           }
           for(int j=top+1;j<=bottom;j++){
               list.add(matrix[j][right]);
           }
           if(top!=bottom){
               for(int k=right-1;k>=left;k--){
                   list.add(matrix[bottom][k]);
               }
           }
           if(left!=right){
               for(int l=bottom-1;l>top;l--){
                   list.add(matrix[l][left]);
               }
           }

           top++;left++;right--;bottom--;
             
       }
        return list; 
       
    }
}
