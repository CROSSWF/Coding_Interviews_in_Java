//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        
        int r = 0;
        if(array == null || array.length < 2){
            num1[0] = num2[0] = 0;
            return;
        }
        
        for(int i = 0;i< array.length;i++){
            r = r ^ array[i];
        }
        int a = 1;
        while((r & a) == 0) a <<= 1;
        
        for(int i = 0;i < array.length;i++){
            
            if((array[i] & a) == 0){
                num1[0] ^= array[i];
            }
            else{
                num2[0] ^= array[i];
            }
        }

    }
            
}

