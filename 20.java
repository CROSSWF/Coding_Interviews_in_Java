import java.util.Arrays;
public class Solution {
    boolean res = false;
    public boolean isNumeric(char[] str) {
        if(str == null || str.length ==0) return res;
        
        str = scanInteger(str);
        System.out.println(str);
        
        if(str.length!=0 && str[0] == '.'){
            
            str = scanUnsignedInteger(Arrays.copyOfRange(str,1,str.length));
        }
        
        if(str.length!=0 &&(str[0] == 'e' || str[0] == 'E')){
            
            str = scanInteger2(str);
        }
        
        return res && str.length == 0;
    }
    
    public char[] scanInteger(char[] str){
        int i = 0;
        if(str.length!=0 && (str[0] == '+' || str[0] =='-')) i++;
        while(i<str.length && str[i]<='9' && str[i]>='0') i++;
        res = true;
        return Arrays.copyOfRange(str,i,str.length);
    }
    
    public char[] scanUnsignedInteger(char[] str){
        int i = 1;
        while(i<str.length && str[i]<='9' && str[i]>='0') i++;
        res = true;
        return Arrays.copyOfRange(str,i,str.length);
    }
    
    public char[] scanInteger2(char[] str){
        int i = 1;
        if(i<str.length && str.length!=0 && (str[i] == '+' || str[i] =='-')) i++;
        while(i<str.length && str[i]<='9' && str[i]>='0') i++;
        res = true;   
        if(str.length == 1) res = false;
        return Arrays.copyOfRange(str,i,str.length);
    }
}
