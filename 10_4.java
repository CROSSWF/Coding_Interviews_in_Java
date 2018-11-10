public class Solution {
    public int RectCover(int target) {

        if(target == 1) return 1;
        if(target == 2) return 2;
        int result1 = 1;
        int result2 = 2;
        
        int temp = 0;
        
        for(int i = 3;i <= target ;i++){
            
            temp = result1 + result2;
            result1 = result2;
            result2 = temp;
        }
        
        return temp;
    }
}
