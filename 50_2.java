public class Solution {
    int c[] = new int[256];
    int index = 0;
    
    //Insert one char from stringstream
    public void Insert(char ch)
    {
       
        index++;
        if(c[ch] == 0){
            c[ch] = index;
        }else{
            c[ch] = -1;
        }
        
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int t = index + 1;
        char res = '#';
        for(int i=0;i<c.length;i++){
            if(c[i]!=0&&c[i]!=-1&&c[i]<t){
                t = c[i];
                res = (char)i;
            }
        }
        
        return res;
    
    }
}
