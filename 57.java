import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       
        ArrayList<ArrayList<Integer> > res = new ArrayList<>();
        
        int p1 = 1, p2 = 2;
        while(p1<p2){
            
            int temp = (p1 + p2) * (p2 - p1 + 1) / 2;
            if(temp == sum){
                ArrayList<Integer> a = new ArrayList<>();
                for(int i = p1; i<= p2 ; i++){
                    a.add(i);
                }
                res.add(a);
                p1++;
                p2++;
            }
            else if(temp > sum){
                p1++;
            }else{
                p2++;
            }
            
        }
        return res;
    }
}
