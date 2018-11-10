public class Solution {
    int [] a = new int[1600];
    public int GetUglyNumber_Solution(int index) {
        if(index == 0) return 0;
        if(index == 1) return 1;
        
        int[] res = new int[index];
        res[0] = 1;
        int a2 = 0,a3 =0, a5 = 0;
        for(int i = 1;i<index;i++){
            res[i] = Math.min(Math.min(res[a2] * 2,res[a3]* 3),res[a5] * 5);
            if(res[i] == res[a2] * 2) a2++;
            if(res[i] == res[a3] * 3) a3++;
            if(res[i] == res[a5] * 5) a5++;
        }
        
        return res[index-1];
    }
}
