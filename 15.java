public class Solution {
    public int NumberOf1(int n) {
        int i = 0;

        if( n < 0) {
           n = n & 0x7FFFFFFF;
           i++;
        }
        while(n != 0){
            if(n % 2 == 1) i++;
            n = n / 2;
        }
        return i;
    }
}
