class Solution {
    public int minSwaps(String s) 
    {
       int count=0;
       int swap=0;  
     for(int i=0;i<s.length();i++)
     {
        char c=s.charAt(i);
         if(c=='[')
         {
           count++;
         }
         if(c==']')
            {
              count--; 
            }
            if(count==-1)
            {
             swap++;
             count+=2;
            }
         }
     return swap;
    }
}