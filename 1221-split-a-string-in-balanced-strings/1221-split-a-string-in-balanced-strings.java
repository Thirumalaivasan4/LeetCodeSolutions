class Solution {
    public int balancedStringSplit(String s) 
    {
        int count=0;
        int n=s.length();
        int lrc=0;

        for(int i=0;i<n;i++)
        {
           if(s.charAt(i)=='R'){
              lrc++;
           }  
           else{
              lrc--;
           }
          if(lrc==0){
            count++;        }
        }
        return count++;
    }
}