public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    
        if(matrix == null || matrix.length == 0) return false;
        if(str == null || str.length == 0) return false;
        if(matrix.length!=rows*cols || rows<=0 || cols<=0 || rows*cols < str.length) return false;
        
        boolean[] visited = new boolean[rows*cols];
        int[] pathlength = {0};
        
        for(int i=0 ; i<=rows-1 ; i++) {
            for(int j=0 ; j<=cols-1 ; j++) {
                if(hasPath(matrix, rows, cols, str, i, j, visited, pathlength)) { return true ; }
            }
        }
 
        return false ;  
        
    }

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str, int row, int col, boolean[] visited, int[] pathlength){
        
        boolean res = false;
        if(row>=0 && row<rows && col>=0 && col<cols && !visited[row*cols+col] && matrix[row*cols+col]==str[pathlength[0]]) {
            pathlength[0]++ ;
            visited[row*cols+col] = true ;
            if(pathlength[0]==str.length) { return true ; }
            res = hasPath(matrix, rows, cols, str, row, col+1, visited, pathlength)  ||
                   hasPath(matrix, rows, cols, str, row+1, col, visited, pathlength)  ||
                   hasPath(matrix, rows, cols, str, row, col-1, visited, pathlength)  ||
                   hasPath(matrix, rows, cols, str, row-1, col, visited, pathlength) ;
 
            if(!res) {
                pathlength[0]-- ;
                visited[row*cols+col] = false ;
            }
        }
 
        return res ;    }

}
