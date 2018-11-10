public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        for(int i = 1;i<=n;i++){
            String str = i + "";
            char [] c = str.toCharArray();
            for(int j = 0;j<c.length;j++){
                if(c[j] == '1'){
                    res++;
                }
            }
        }
        
        return res;
    }
}
