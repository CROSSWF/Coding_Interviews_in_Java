public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0) return 0;
        if(array.length == 1) return array[0];
        int res,max;
        res = array[0];
        max = array[0];
        
        for(int i = 1;i < array.length ;i++){
            max = Math.max(array[i],max + array[i]);
            res = Math.max(max,res);
        }
        return res;
    }
}
