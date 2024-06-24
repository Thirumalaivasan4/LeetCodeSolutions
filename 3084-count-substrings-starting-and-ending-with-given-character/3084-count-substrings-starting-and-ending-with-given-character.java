class Solution {
    public long countSubstrings(String s, char c) 
    {
    long count=0;
      for(int i=0;i<s.length();i++)
      {
             if(s.charAt(i)==c) {
                count++;
             } 
             }
         return helper(count);
      
    }
    long helper(long val)
    {        
             if(val==0){
                return 0;
             }
             return val+helper(val-1);
    }
}