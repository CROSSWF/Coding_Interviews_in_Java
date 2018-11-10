import java.util.ArrayList;

public class Solution {
    public String PrintMinNumber(int [] numbers) {

        if(numbers.length == 0) return "";
        if(numbers.length == 1) return numbers[0] + "";
        String[] str = new String[numbers.length];
        for(int i = 0;i < numbers.length; i++){
            str[i] = numbers[i] + "";
        }
        
        for(int i = 0;i< str.length-1;i++){
            for(int j = 0 ; j < str.length -1-i;j++){
                Double a1 = Double.parseDouble(str[j].toString() + str[j+1].toString());
                Double a2 = Double.parseDouble(str[j+1].toString() + str[j].toString());
                
                if(a1 > a2){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        
        String res = "";
        for(int i = 0;i< str.length;i++){
            res = res + str[i];
        }
        return res;
    }
}
