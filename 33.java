import java.util.Arrays;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        if(sequence.length == 1 || sequence.length == 2) return true;
        int l = sequence.length;
        
        int mid = sequence[l-1];
        int i = 0;
        while(sequence[i] < mid) i++;
        for(int j = i; j < l;j++){
            if(sequence[j] < mid) return false;
        }
        
        if(i == 0){
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,l-1));
        }else if(i == (l-1)){
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,l-1));
        }else{
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i+1)) && VerifySquenceOfBST(Arrays.copyOfRange(sequence,i+1,l)); 
        }
    }
}
