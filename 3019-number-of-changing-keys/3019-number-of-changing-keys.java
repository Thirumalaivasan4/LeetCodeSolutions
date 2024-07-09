class Solution {
    public int countKeyChanges(String s) 
    {  int c=0;
       for(int i=0,j=1;i<s.length()-1&&j<s.length();j++,i++)
       {   
             char c1=s.charAt(i);
             char c2=s.charAt(j);

            if('A'<=c1&&c1<='Z'){
                c1=(char)(c1+32);
            }

            if('A'<=c2&&c2<='Z')
            {
                 c2=(char)(c2+32);
            }
            if(c1!=c2){
                c++;
              }
       }
       return c;
    }
}