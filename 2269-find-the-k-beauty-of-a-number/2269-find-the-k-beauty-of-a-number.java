class Solution {
    public int divisorSubstrings(int num, int k) {
           String s=num+"";

           int c=0;
           String current="";
           for(int i=0;i<=s.length()-k;i++)
           {
            current=s.substring(i,i+k);
          
            int b=Integer.parseInt(current);
            if(b!=0&&num%b==0)
             {
               c++;
             }
           }
           return c;
    }
}