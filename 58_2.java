public class Solution {
    public String ReverseSentence(String str) {
        if(str.trim().equals("")) return str;
        String res = "";
        String[] temp = str.split(" ");
        for(int i = temp.length -1;i >= 0; i--){
            if(i == temp.length -1){
                res = temp[i];
            }else{
                res = res + " " + temp[i];
            }
            
        }
        
        return res;
    }
}
