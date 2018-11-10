import java.util.HashMap;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0) return 0;
        if(array.length == 1) return array[0];
        int mid = array.length / 2;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i < array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                int j = map.get(array[i]);
                if(++j > mid) return array[i];
                map.put(array[i],j);
            }
        }
        
        return 0;
    }
}
