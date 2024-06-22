class Solution {
    public String removeOuterParentheses(String s) 
    {
        int count=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
         if(c=='('){
            count ++;
            if(count>1){
               res=res+'(';
            }
         }
         else{
            count--;
            if(count>0){
                     res=res+')';
            }
         }
        }
        return res;
        
    }
}