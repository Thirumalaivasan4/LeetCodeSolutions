class Solution {
    public int minAddToMakeValid(String s) 
    {
        String ri="";
     Stack<Character> st=new Stack<Character>();
     for(int i=0;i<s.length();i++)
     {
        char c=s.charAt(i);
         if(c=='(')
         {
            st.push(c);
         }
         else
         {
            if(!st.isEmpty())
            {
              st.pop(); 
            }
            else{
                ri+=c;
            }
         }
     }
     return st.size()+ri.length();
   
        
    }
}