import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        
        if(array == null || array.length < 2) return res;
        int max = 0;
        int i = 0;
        int j = array.length -1;
        while(i < j){
            int cur = array[i] + array[j];
            if(cur == sum){
                if(res.size() == 0){
                    res.add(array[i]);
                    res.add(array[j]);
                    max = array[i] * array[j];
                }else if(res.size() != 0 && array[i] * array[j] < max){
                    res.clear();
                    res.add(array[i]);
                    res.add(array[j]);
                    max = array[i] * array[j];
                }
                
                i++;
                j--;
            }
            else if(cur > sum) j--;
            else i++;
        }
        
        return res;
    }
}
