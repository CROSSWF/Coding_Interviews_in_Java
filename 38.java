import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if(str == "") return res;
        char [] c = str.toCharArray();
        temp(c,0);
        Collections.sort(res);
        return res;
    }
    public void temp(char[] c,int i){
        if(i == c.length-1 &&){
            res.add(new String(c)); 
            return;  
        }
        
        for(int j = i;j < c.length;j++){
            swap(c,i,j);
            temp(c,i+1);
            swap(c,i,j);
        }
    }
    
    public void swap(char[] c,int i,int j){
        
        char t = c[j];
        c[j] = c[i];
        c[i] = t;
    }
}
