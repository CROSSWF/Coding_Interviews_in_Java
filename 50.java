import java.util.ArrayList;
import java.util.HashSet;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str == "") return -1;
        
        char[] c = str.toCharArray();
        ArrayList<Character> al = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<c.length;i++){
            if(!set.contains(c[i])){
                if(al.contains(c[i])){
                    al.remove(Character.valueOf(c[i]));
                    set.add(c[i]);
                }else{
                    al.add(c[i]);
                }
            }
        }
        if(al.size() != 0) return str.indexOf(al.get(0));
        return -1;
    }
}
