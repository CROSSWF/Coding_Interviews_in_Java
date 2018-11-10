import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
                
        ArrayList<Integer> res = new ArrayList<>();
        if(input.length < k) return res;
        
        Arrays.sort(input);
        
        
        for(int i = 0;i < k;i++){
            res.add(input[i]);
        }
        
        return res;
    }
}
