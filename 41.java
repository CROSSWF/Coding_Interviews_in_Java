import java.util.ArrayList;
import java.util.Collections;
public class Solution {

    public ArrayList<Integer> al = new ArrayList<>();
    public void Insert(Integer num) {
    
        al.add(num);
    }

    public Double GetMedian() {
        
        Collections.sort(al);
        if(al.size() == 0) return null;
        if(al.size() % 2 == 0) {
            int i = al.size() / 2;
            return (Double.valueOf(al.get(i)) + Double.valueOf(al.get(i-1))) / 2.0;
        }
        return Double.valueOf(al.get(al.size() / 2));
        
    }


}
