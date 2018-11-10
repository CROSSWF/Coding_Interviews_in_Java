import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
    
        if(array.length == 0) return 0;
        int max = array[0];
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] >= max) max = array[i];
            else return array[i];
        }
        return array[0];
    }
}
