import java.util.Arrays;

public class Solution {
    public String LeftRotateString(String str,int n) {
        
        char[] c = str.toCharArray();
        if(c.length < n) return "";
        
        char[] temp = Arrays.copyOfRange(c,n,c.length);
        return new String(temp) + new String(Arrays.copyOfRange(c,0,n));
    }
}
