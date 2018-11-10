public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(pattern == null || str == null) return false;
        String s = new String(str);
        String p = new String(pattern);
        
        if(p.isEmpty()) return s.isEmpty();
        boolean fm = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if(p.length() >=2 && p.charAt(1) == '*'){
            return (fm && match(s.substring(1).toCharArray(),p.toCharArray())) ||
                match(s.toCharArray(),p.substring(2).toCharArray());
        }
        return fm && match(s.substring(1).toCharArray(),p.substring(1).toCharArray());
        
        
    }
}
