public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visited = new boolean[rows][cols];
        movingCount(0, 0, rows, cols, visited, threshold);
        int res = 0;
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols; j++){
                if(visited[i][j] == true) res++;
            }
        }
        
        return res;
    }
    
    public void movingCount(int r, int c, int rows, int cols, boolean[][] visited, int threshold){
        if(r<0||r>rows-1||c<0||c>cols-1||temp(c)+temp(r)>threshold||visited[r][c] == true) return;
        visited[r][c] = true;
        movingCount(r - 1, c, rows, cols, visited, threshold);
        movingCount(r + 1, c, rows, cols, visited, threshold);
        movingCount(r, c - 1, rows, cols, visited, threshold);
        movingCount(r, c + 1, rows, cols, visited, threshold); 
    }
    
    public int temp(int a){
        
        int res = 0;
        while(a != 0){
            res += a % 10;
            a = a/10;
        }
        
        return res;
    }
}
