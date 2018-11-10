import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(size > num.length || size < 1) return res;
        
        for(int i=0;i+size-1<num.length;i++){
            int max = num[i];
            for(int j=0;j<size;j++){
                if(num[i+j]>max) max=num[i+j]; 
            }
            
            res.add(max);
        }
        
        return res;
    } 
}
