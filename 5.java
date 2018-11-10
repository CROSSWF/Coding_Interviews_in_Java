public class Solution {
    public String replaceSpace(StringBuffer str) {
    	char [] str1 = str.toString().toCharArray();
        String temp = "";
        for(char c:str1){
           if(c == ' ') temp = temp + "%20";
           else temp = temp + c;
        }
        return temp;
    }
}
