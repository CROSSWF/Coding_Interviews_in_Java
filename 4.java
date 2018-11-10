public class Solution {
    public boolean Find(int target, int [][] array) {
        int l1 = array.length;
        int l2 = array[0].length;
        if(l1 == 0 || l2 == 0) return false;
        for(int i = 0; i < l1 && array[i][0] <= target;i++){
            for(int j = 0;j < l2 &&  array[i][j] <= target; j++){
                if(target == array[i][j]) return true;
            }
        }
        return false;
    }
}
