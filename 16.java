public class Solution {
    public double Power(double base, int exponent) {
        double i = base;
        if(exponent > 0)
            while(exponent != 1){
            i = i * base;
            exponent--;
           }
        else if(exponent < 0){
            exponent = -exponent;
             while(exponent != 1){
            i = i * base;
            exponent--;
           }
            i = 1/i;
        }
        else return 1;
        return i;
}
}
