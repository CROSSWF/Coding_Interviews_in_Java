public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       if(array.length == 0) return 0;
        int res = 0;
        for(int i =0;i<array.length;i++){
            if(array[i] == k) res++;
        }
        
        return res;
      
    }
}
