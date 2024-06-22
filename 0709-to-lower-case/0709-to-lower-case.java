class Solution {
    public String toLowerCase(String s) 
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        { 
            char c=s.charAt(i);
            if(c>='A'&&c<='Z')
            {
                ans+=(char)(c+32);
            }
            else{
              ans+=c;  
            }}
            return ans;

        

    }
}