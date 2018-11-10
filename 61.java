import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {

        if(numbers == null || numbers.length == 0) return false;
        int num0 = 0;
        int num1 = 0;
        
        Arrays.sort(numbers);
        for(int i =0; i < numbers.length - 1;i++){
            if(numbers[i] == 0){
                num0 ++;
                continue;
            }
            
            if(numbers[i] == numbers[i+1]) return false;
            
            num1 += numbers[i+1] - numbers[i] -1; 
        }
        
        if(num0 >= num1) return true;
        
        return false;
    }
}
