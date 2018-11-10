public class Solution {
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0) return 0;
        int[] copy = new int[array.length];
        for(int i = 0;i < array.length;i++) copy[i] = array[i];
        
        int res = InversePairs(array,copy,0,array.length-1);
        return res;
    }
    
    public int InversePairs(int [] array,int [] copy,int low,int high) {
    
        if(low == high) return 0;
        int mid = (low + high) / 2;
        int left = InversePairs(array,copy,low,mid) % 1000000007;
        int right = InversePairs(array,copy,mid+1,high) % 1000000007;
        
        int count = 0;
        int i = mid, j = high;
        int k = high;
        while(i>=low && j>mid){
           if(array[i] > array[j]){
               count += j - mid;
               copy[k] = array[i];
               k--;i--;
               if(count >= 1000000007) count%=1000000007;
           } 
           else{
               copy[k] = array[j];
               k--;j--;
           }
        }
           for(;i>=low;i--)
        {
            copy[k--]=array[i];
        }
        for(;j>mid;j--)
        {
            copy[k--]=array[j];
        }
        for(int s=low;s<=high;s++)
        {
            array[s] = copy[s];
        }
        return (left+right+count)%1000000007;  
        
        
        
    }    
}
