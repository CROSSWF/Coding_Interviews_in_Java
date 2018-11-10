public class Solution {
    public void reOrderArray(int [] array) {
        
        for(int i=0;i<array.length;i++){
            for(int j=1;j<array.length-i;j++){
                if((array[j-1]% 2 == 0) && (array[j] % 2 == 1))
                {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
