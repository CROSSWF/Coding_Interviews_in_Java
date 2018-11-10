public class Solution {
    public int StrToInt(String str) {
        if(str == null || str.trim().equals("")) return 0;
        char[] c = str.toCharArray();
        int singal = 1;
        int i = 0;
        int res = 0;
        if(c[0] == '-'){
            singal = -1;
            i++;
        } 
        if(c[0] == '+') i++;
        for(;i<c.length;i++){
            if(!('0'<c[i] && c[i]<'9')) return 0;
            res = res * 10 + (c[i] - '0');
        }
        
        return res * singal;
    }
}
